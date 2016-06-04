package controlas;

import classeDeNegocio.Linha;
import classeDeNegocio.Onibus;
import classeDeNegocio.Passagem;
import classesDeAjuda.Arquivo;
import classesDeAjuda.DataHora;
import janelas.JanelaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Lucas Tomasi
 */
public class ControlaPassagens {

    Arquivo bdPassagens;
    ArrayList<Passagem> passagens;

    /**
     * inicia o array de passagens e abre o arquivo txt
     */
    public ControlaPassagens() {
        bdPassagens = new Arquivo("bdPassagens.txt");
        passagens = new ArrayList<>();
        abrirArquivo();
    }

    /**
     * insere a passagem no array e salva no arquivo txt
     *
     * @param novaPassagem nova passagem a ser emitida
     */
    public void emitir(Passagem novaPassagem) {
        novaPassagem.setSituacao('V');
        passagens.add(novaPassagem);
        salvarArquivo();
    }

    /**
     * transfere o conteudo do arquivo txt para o array de passagens
     */
    public void abrirArquivo() {
        if (bdPassagens.abrirLeitura()) {
            ArrayList<String> aux = bdPassagens.lerLinhas();
            for (int i = 0; i < aux.size(); i++) {
                String passagem[] = aux.get(i).split(";");
                Passagem novaPassagem = new Passagem();
                novaPassagem.setCodigo(Integer.parseInt(passagem[0]));
                novaPassagem.setData(passagem[1]);
                novaPassagem.setDestino(passagem[2]);
                novaPassagem.setHora(passagem[3]);
                novaPassagem.setParada(passagem[4]);
                novaPassagem.setLinha(Integer.parseInt(passagem[5]));
                novaPassagem.setPoltrona(Integer.parseInt(passagem[6]));
                novaPassagem.setSeguro(Boolean.parseBoolean(passagem[7]));
                novaPassagem.setSituacao(passagem[8].charAt(0));
                novaPassagem.setValorParada(Double.parseDouble(passagem[9]));
                novaPassagem.setValorSeguro(Double.parseDouble(passagem[10]));
                novaPassagem.setValorTotal(Double.parseDouble(passagem[11]));
                passagens.add(novaPassagem);
            }
        }
        bdPassagens.fecharArquivo();
    }

    /**
     * transfere as informacoes do array para o arquivo txt
     */
    private void salvarArquivo() {
        if (bdPassagens.abrirEscrita()) {
            for (int i = 0; i < passagens.size(); i++) {
                Passagem parada = passagens.get(i);
                String aux = ""
                        + parada.getCodigo() + ";"
                        + parada.getData() + ";"
                        + parada.getDestino() + ";"
                        + parada.getHora() + ";"
                        + parada.getParada() + ";"
                        + parada.getLinha() + ";"
                        + parada.getPoltrona() + ";"
                        + parada.isSeguro() + ";"
                        + parada.getSituacao() + ";"
                        + parada.getValorParada() + ";"
                        + parada.getValorSeguro() + ";"
                        + parada.getValorTotal();
                bdPassagens.escreverLinha(aux);
            }
        }
        bdPassagens.fecharArquivo();
    }

    /**
     *
     * @param passagem passagem para efetuar cancelamento
     * @return TRUE = cancelada com sucesso FALSE = passagem ja estava cancelda
     */
    public boolean cancelar(Passagem passagem) {
        if (passagem.getSituacao() == 'V') {
            passagem.setSituacao('C');
            Linha linha = JanelaPrincipal.ctlLinha.buscarLinha(passagem.getLinha());
            String situacaoPoltronas[] = linha.getSituacaoPoltronas();
            situacaoPoltronas[passagem.getPoltrona()] = "L";
            linha.setSituacaoPoltronas(situacaoPoltronas);
            JanelaPrincipal.ctlLinha.salvarArquivo();
            salvarArquivo();
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param codigoPassagem
     * @return passagem ou null se a passagem nao existe
     */
    public Passagem buscar(int codigoPassagem) {
        for (int i = 0; i < passagens.size(); i++) {
            if (passagens.get(i).getCodigo() == codigoPassagem) {
                return passagens.get(i);
            }
        }
        return null;
    }

    /**
     *
     * @param codigoPassagem codigo da passagem para cancelar
     * @return TRUE = passagem pode ser cancelada FALSE = passagem nao pode ser
     * cancelada
     */
    public boolean validarCancelamento(int codigoPassagem) {
        boolean poltronasZeradas = true;
        if (codigoPassagem > 0 && codigoPassagem < (passagens.size() + 1)) {
            Passagem passagem = buscar(codigoPassagem);
            Linha linha = JanelaPrincipal.ctlLinha.buscarLinha(passagem.getLinha());
            String situacaoPoltronas[] = linha.getSituacaoPoltronas();
            for (int i = 0; i < situacaoPoltronas.length; i++) {
                if (situacaoPoltronas[i].equalsIgnoreCase("V")) {
                    poltronasZeradas = false;
                }
            }
            if (!poltronasZeradas && DataHora.getData().equalsIgnoreCase(passagem.getData()) && (JanelaPrincipal.ctlLinha.verificarHoraSaida(linha.getHorario()))) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @return todas as passagens
     */
    public ArrayList<Passagem> listar() {
        return passagens;
    }

    /**
     *
     * @param passagens array de passagens para filtar
     * @param situacao situacao da passagem 'V' ventidas 'C' canceladas para filtro
     * @return array de passagens com a situacao
     */
    public ArrayList<Passagem> listar(ArrayList<Passagem> passagens, char situacao) {
        ArrayList<Passagem> auxListar = new ArrayList<>();
        for (int i = 0; i < passagens.size(); i++) {
            if (passagens.get(i).getSituacao() == situacao) {
                auxListar.add(passagens.get(i));
            }
        }
        return auxListar;
    }

    /**
     *
     * @param passagens array de passagens para filtrar
     * @param parada parada para filtro
     * @return array de passagens com a parada
     */
    public ArrayList<Passagem> listar(ArrayList<Passagem> passagens, String parada) {
        ArrayList<Passagem> auxListar = new ArrayList<>();
        for (int i = 0; i < passagens.size(); i++) {
            if (passagens.get(i).getParada().equalsIgnoreCase(parada)) {
                auxListar.add(passagens.get(i));
            }
        }
        return auxListar;
    }

    /**
     *
     * @param passagens array de passagens para filtrar
     * @param dataDe data inicial para filtro
     * @param dataAte data final para filtro
     * @return array de passagens com as passagens de dataDe ate dataAte
     */
    public ArrayList<Passagem> listar(ArrayList<Passagem> passagens, String dataDe, String dataAte) {
        ArrayList<Passagem> auxListar = new ArrayList<>();
        for (int i = 0; i < passagens.size(); i++) {
            if (passagens.get(i).getData().compareToIgnoreCase(dataDe) >= 0 && passagens.get(i).getData().compareToIgnoreCase(dataAte) <= 0) {
                auxListar.add(passagens.get(i));
            }
        }
        return auxListar;
    }

    /**
     * 
     * @param passagens array de passagens para filtrar
     * @param onibus onibus para filtro
     * @return array de passagens com o onibus
     */
    public ArrayList<Passagem> listar(ArrayList<Passagem> passagens, Onibus onibus){
        ArrayList<Passagem> auxListar = new ArrayList<>();
        for (int i = 0; i < passagens.size(); i++) {
            Onibus onibusAux = JanelaPrincipal.ctlOnibus.buscar(JanelaPrincipal.ctlLinha.buscarLinha(passagens.get(i).getLinha()).getOnibus());
            if(onibus.equals(onibusAux)){
                auxListar.add(passagens.get(i));
            }
        }
        return auxListar;
    }
    /**
     * 
     * @param passagens array de passagens para filtrar
     * @param linha linha para filtro 
     * @return array de passagens com a linha 
     */
    public ArrayList<Passagem> listar(ArrayList<Passagem> passagens, Linha linha){
        ArrayList<Passagem> auxListar = new ArrayList<>();
        for (int i = 0; i < passagens.size(); i++) {
            Linha linhaAux = JanelaPrincipal.ctlLinha.buscarLinha(passagens.get(i).getLinha());
            if(linha.equals(linhaAux)){
                auxListar.add(passagens.get(i));
            }
        }
        return auxListar;
    }  
    
    /**
     *
     * @param passagem  passagem para gerar bilhete txt
     * @return o bilhete
     */
    public String gerarBilhete(Passagem passagem) {
        Arquivo bilhete = new Arquivo(passagem.getCodigo() + ".txt");
        Linha linha = JanelaPrincipal.ctlLinha.buscarLinha(passagem.getLinha());
        Onibus onibus = JanelaPrincipal.ctlOnibus.buscar(linha.getOnibus());
        String status;
        if (passagem.isSeguro()) {
            status = "Sim";
        } else {
            status = "Não";
        }

        String bilheteAux = ""
                + "===========================\r\n\r\n"
                + " Rodoviaria Progresso\r\n\r\n"
                + " COD.: " + passagem.getCodigo() + "\r\n\r\n"
                + " Data: " + passagem.getData() + "\r\n\r\n"
                + " Hora: " + passagem.getHora() + "\r\n\r\n"
                + "===========================\r\n\r\n"
                + " Status: " + passagem.getSituacao() + "\r\n"
                + " Linha: " + linha.getNumeroLinha() + "\r\n"
                + " Onibus: " + onibus.getNumeroOnibus() + "\r\n"
                + " Seguro: " + status + "\r\n"
                + " Valor: " + passagem.getValorParada() + "\r\n"
                + " Valor Seguro: " + passagem.getValorSeguro() + "\r\n"
                + " Saida: " + linha.getHorario() + "\r\n"
                + " Origem: Progresso\r\n"
                + " Destino: " + passagem.getDestino() + "\r\n"
                + " Parada: " + passagem.getParada() + "\r\n"
                + " Assento: " + passagem.getPoltrona() + "\r\n\r\n"
                + " Valor Total: " + passagem.getValorTotal() + "\r\n\r\n"
                + "===========================\r\n\r\n"
                + " Boa Viagem!\r\n\r\n"
                + "===========================\r\n";
        if (bilhete.abrirEscrita()) {
            bilhete.escreverLinha(bilheteAux);
        }
        bilhete.fecharArquivo();
        return bilheteAux;
    }

    /**
     *
     * @return numero da proxima passagem atual
     */
    public int codigoPassagem() {
        return passagens.size();
    }
}
