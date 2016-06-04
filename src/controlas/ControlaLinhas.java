package controlas;

import classeDeNegocio.Cidade;
import classeDeNegocio.Linha;
import classeDeNegocio.Onibus;
import classeDeNegocio.Parada;
import classesDeAjuda.Arquivo;
import classesDeAjuda.DataHora;
import static classesDeAjuda.DataHora.getHora;
import janelas.JanelaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Lucas Tomasi
 */
public class ControlaLinhas {

    ArrayList<Linha> linhas;
    Arquivo bdLinhas;

    /**
     * inicia o array de linhas e abre o arquivo "bdLinhas.txt"
     */
    public ControlaLinhas() {
        linhas = new ArrayList<>();
        bdLinhas = new Arquivo("bdLinhas.txt");
        abrirArquivo();
    }

    /**
     *
     * @param l Linha para a verificação
     * @param novasParadas novas paradas
     * @param novoOnibus novo onibus
     * @return TRUE se novoOnibus e NovasParadas estao ativas
     */
    public boolean verificarObjetosInativosDaLinha(Linha l, ArrayList<String> novasParadas, Onibus novoOnibus) {
        for (int i = 0; i < novasParadas.size(); i++) {
            String novasParadasAux[] = novasParadas.get(i).split(";");
            int codigoCidade = Integer.parseInt(novasParadasAux[0]);
            Cidade cidade = JanelaPrincipal.ctlCidades.buscar(codigoCidade);
            if (!cidade.isSituacao()) {
                return false;
            }
        }
        if (!novoOnibus.isSituacao()) {
            return false;
        }

        return true;
    }

    /**
     * salva no array e no arquivo txt
     *
     * @param novaLinha linha a ser inserida
     */
    public void inserir(Linha novaLinha) {
        JanelaPrincipal.ctlParadas.inserir(novaLinha.getParadas());
        novaLinha.setSituacaoPoltronas(iniciarPoltronas(novaLinha));
        linhas.add(novaLinha);
        salvarArquivo();
    }

    /**
     * vetor de Strings onde 1ª posicao é a data atual e as outras posicoes sao
     * preenchidas com "L"
     *
     * @param linha Linha para iniciar poltronas
     * @return todas as poltronas com a situacao de livres
     */
    public String[] iniciarPoltronas(Linha linha) {
        String poltronas[] = new String[(JanelaPrincipal.ctlOnibus.buscar(linha.getOnibus()).getAssentos()) + 1];
        poltronas[0] = DataHora.getData();
        for (int i = 1; i < poltronas.length; i++) {
            poltronas[i] = "L";
        }
        return poltronas;
    }

    /**
     * define a poltrona como "V" vendida e salva arquivo
     *
     * @param linha linha da venda da passagem
     * @param poltrona numero da poltrona vendida
     */
    public void venderPoltrona(Linha linha, int poltrona) {
        String poltronas[] = linha.getSituacaoPoltronas();
        poltronas[poltrona] = "V";
        linha.setSituacaoPoltronas(poltronas);
        salvarArquivo();
    }

    /**
     * @param linha linha para descartar da verificação
     * @param numeroLinha numero para verificar se o nome ja existe
     * @return TRUE = nenhuma linha com o mesmo numero FALSE = numero já
     * existente em outra linha
     */
    public boolean verificarNome(Linha linha, String numeroLinha) {
        for (int i = 0; i < linhas.size(); i++) {
            if (!linhas.get(i).equals(linha)) {
                if (linhas.get(i).getNumeroLinha().equalsIgnoreCase(numeroLinha)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     *
     * @param codigoLinha codigo da linha
     * @return a linha que contem o codigoLinha
     */
    public Linha buscarLinha(int codigoLinha) {
        for (int i = 0; i < linhas.size(); i++) {
            if (linhas.get(i).getCodigo() == codigoLinha) {
                return linhas.get(i);
            }
        }
        return null;
    }

    /**
     *
     * @return todas as linhas
     */
    public ArrayList<Linha> listar() {
        return linhas;
    }

    /**
     *
     * @param linhas array linhas para filtrar
     * @param situacao situacao para filtro TRUE = ativo FALSE = inativo
     * @return array de linhas com a situacao
     */
    public ArrayList<Linha> listar(ArrayList<Linha> linhas, boolean situacao) {
        ArrayList<Linha> auxListar = new ArrayList<>();
        for (int i = 0; i < linhas.size(); i++) {
            if (linhas.get(i).isSituacao() == situacao) {
                auxListar.add(linhas.get(i));
            }
        }
        return auxListar;
    }

    /**
     *
     * @param onibus onibus da linha
     * @return todas as linhas com o onibus
     */
    public ArrayList<Linha> listar(Onibus onibus) {
        ArrayList<Linha> auxListar = new ArrayList<>();
        for (int i = 0; i < linhas.size(); i++) {
            if (linhas.get(i).getOnibus() == onibus.getCodigo()) {
                auxListar.add(linhas.get(i));
            }
        }
        return auxListar;
    }

    /**
     *
     * @param linhas array de linhas para filtar
     * @param frequencia frequncia para filtro
     * @return array de linhas com a frequencia
     */
    public ArrayList<Linha> listar(ArrayList<Linha> linhas, String frequencia) {
        ArrayList<Linha> auxListar = new ArrayList<>();
        for (int i = 0; i < linhas.size(); i++) {
            ArrayList<String> frequencias = linhas.get(i).getFreq();
            for (int j = 0; j < frequencias.size(); j++) {
                if (frequencias.get(j).equalsIgnoreCase(frequencia)) {
                    auxListar.add(linhas.get(i));
                }
            }
        }
        return auxListar;
    }

    /**
     *
     * @param linhas array de linhas para filtrar
     * @param descricao descricao para filtro
     * @return array de linhas com a descricao
     */
    public ArrayList<Linha> listar(String descricao, ArrayList<Linha> linhas) {
        ArrayList<Linha> auxListar = new ArrayList<>();
        for (int i = 0; i < linhas.size(); i++) {
            if (linhas.get(i).getNumeroLinha().toLowerCase().contains(descricao.toLowerCase())) {
                auxListar.add(linhas.get(i));
            }

        }
        return auxListar;
    }

    /**
     *
     * @param linhas array de linhas para filtrar
     * @param codigoParadas codigo para filtro
     * @return array linhas com o codigoParadas
     */
    public ArrayList<Linha> listar(int codigoParadas, ArrayList<Linha> linhas) {
        ArrayList<Linha> auxListar = new ArrayList<>();
        for (int i = 0; i < linhas.size(); i++) {
            ArrayList<Parada> destinoParadas = linhas.get(i).getParadas();
            for (int j = 0; j < destinoParadas.size(); j++) {
                if (destinoParadas.get(j).getParada() == codigoParadas) {
                    auxListar.add(linhas.get(i));
                }
            }
        }
        return auxListar;
    }

    /**
     *
     * @param codigoParadas codigo da cidade
     * @return array linhas com a cidade
     */
    public ArrayList<Linha> procurarParadas(int codigoParadas) {
        ArrayList<Linha> auxListar = new ArrayList<>();
        for (int i = 0; i < linhas.size(); i++) {
            if (linhas.get(i).isSituacao()) {
                ArrayList<Parada> paradasLinha = linhas.get(i).getParadas();
                for (int j = 0; j < paradasLinha.size(); j++) {
                    if (paradasLinha.get(j).getParada() == codigoParadas) {
                        auxListar.add(linhas.get(i));
                    }
                }
            }
        }
        return auxListar;
    }

    /**
     *
     * @param linhas array de linhas para filtrar
     * @param codigoOnibus codigo do onibus para filtro
     * @return array de linhas com o onibus
     */
    public ArrayList<Linha> listar(ArrayList<Linha> linhas, int codigoOnibus) {
        ArrayList<Linha> auxListar = new ArrayList<>();
        for (int i = 0; i < linhas.size(); i++) {
            if (linhas.get(i).getOnibus() == codigoOnibus) {
                auxListar.add(linhas.get(i));
            }
        }
        return auxListar;
    }

    /**
     * metodo ja zera poltronas se passou o dia
     *
     * @param linhas array de linhas para filtrar
     * @return array de linhas filtrados pelo dia da semana [dom, seg, ter, qua,
     * qui, sex, sab] e hora da saida
     */
    public ArrayList<Linha> listar(ArrayList<Linha> linhas) {
        ArrayList<Linha> auxListar = new ArrayList<>();
        for (int i = 0; i < linhas.size(); i++) {
            zerarPoltronasLinha(linhas.get(i));
            ArrayList<String> dias = linhas.get(i).getFreq();
            for (int j = 0; j < dias.size(); j++) {
                if (dias.get(j).equalsIgnoreCase(DataHora.getDiaSemana()) && (verificarHoraSaida(linhas.get(i).getHorario()))) {
                    auxListar.add(linhas.get(i));
                }
            }
        }
        return auxListar;
    }

    /**
     *
     * @param linha linha para verificar se o onibus ja partiu
     * @return TRUE = poltronas foram zeradas FALSE = onibus ainda nao partiu
     */
    public boolean zerarPoltronasLinha(Linha linha) {
        boolean zerou = false;
        String novaSituacaoPoltronas[] = new String[JanelaPrincipal.ctlOnibus.buscar(linha.getOnibus()).getAssentos() + 1];
        if ((linha.getSituacaoPoltronas()[0].compareTo(DataHora.getData())) < 0) {
            novaSituacaoPoltronas[0] = DataHora.getData();
            for (int i = 1; i < novaSituacaoPoltronas.length; i++) {
                novaSituacaoPoltronas[i] = "L";
            }
            linha.setSituacaoPoltronas(novaSituacaoPoltronas);
            salvarArquivo();
            zerou = true;
        }
        return zerou;
    }

    /**
     *
     * @param codigoLinha codigo da linha para buscar destino final
     * @return o destino final
     */
    public int buscarDestino(int codigoLinha) {
        ArrayList<Parada> destinoFinal = JanelaPrincipal.ctlParadas.buscar(codigoLinha);
        return destinoFinal.get(0).getParada();
    }

    /**
     *
     * @param codigoLinha codigo da linha para buscar paradas
     * @return todas as paradas da linha com execao do destino final
     */
    public ArrayList<Parada> buscarParadas(int codigoLinha) {
        ArrayList<Parada> paradas = JanelaPrincipal.ctlParadas.buscar(codigoLinha);
        paradas.remove(paradas.get(0));
        return paradas;
    }

    /**
     *
     * @param parada descricao/nome da cidade
     * @return todas as linhas que passam pela parada
     */
    public ArrayList<Linha> listar(String parada) {
        ArrayList<Linha> auxListar = new ArrayList<>();
        for (int i = 0; i < linhas.size(); i++) {
            ArrayList<Parada> paradasAux = linhas.get(i).getParadas();
            for (int j = 0; j < paradasAux.size(); j++) {
                Cidade cidade = JanelaPrincipal.ctlCidades.buscar(paradasAux.get(i).getParada());
                if (cidade.toString().equalsIgnoreCase(parada)) {
                    auxListar.add(linhas.get(i));
                }
            }
        }
        return auxListar;
    }

    /**
     *
     * @param HoraSaida hora da saida do Onibus
     * @return FALSE = saiu TRUE = nao saiu
     */
    public static boolean verificarHoraSaida(String HoraSaida) {
        if (HoraSaida.compareToIgnoreCase(getHora()) <= 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     *
     * @param onibus onibus da nova linha para verificar
     * @param frequencia frequencia da nova linha para verificar
     * @param horaSaida hora da saida do onibus da nova linha para verificar
     * @param linha linha para alteracao (ignora na hora de verificar)
     * @return TRUE = onibus disponivel FALSE = onibus ja utilizado nesse
     * horario/frequencia
     */
    public boolean verificarDisponibilidadeOnibus(Onibus onibus, ArrayList<String> frequencia, String horaSaida, Linha linha) {
        ArrayList<Linha> linhas = JanelaPrincipal.ctlLinha.listar(onibus);
        for (int i = 0; i < linhas.size(); i++) {
            if (!linhas.get(i).equals(linha)) {
                if (linhas.get(i).getHorario().equalsIgnoreCase(horaSaida)) {
                    ArrayList<String> frequenciaLinha = linhas.get(i).getFreq();
                    for (int j = 0; j < frequencia.size(); j++) {
                        for (int k = 0; k < frequencia.size(); k++) {
                            if (frequenciaLinha.get(j).equalsIgnoreCase(frequencia.get(k))) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /**
     * Abre o arquivo texto e insere as linhas no controla
     */
    private void abrirArquivo() {
        if (bdLinhas.abrirLeitura()) {
            ArrayList<String> linhas = bdLinhas.lerLinhas();
            for (int i = 0; i < linhas.size(); i++) {
                String aux[] = linhas.get(i).split(";");
                ArrayList<String> freq = new ArrayList<>();
                String auxFreq[] = aux[3].split("!");
                for (int j = 0; j < auxFreq.length; j++) {
                    freq.add(auxFreq[j]);
                }
                String auxPoltronas[] = aux[5].split("!");
                String poltrona[] = new String[auxPoltronas.length];
                for (int j = 0; j < auxPoltronas.length; j++) {
                    poltrona[j] = auxPoltronas[j];
                }
                Linha novaLinha = new Linha();
                novaLinha.setHorario(aux[1]);
                novaLinha.setNumeroLinha(aux[4]);
                novaLinha.setOnibus(Integer.parseInt(aux[0]));
                novaLinha.setSituacao(Boolean.parseBoolean(aux[2]));
                novaLinha.setFreq(freq);
                novaLinha.setParadas(JanelaPrincipal.ctlParadas.buscar(novaLinha.getCodigo()));
                novaLinha.setSituacaoPoltronas(poltrona);
                novaLinha.setExtra(Boolean.parseBoolean(aux[6]));
                this.linhas.add(novaLinha);
            }

        }
        bdLinhas.fecharArquivo();
    }

    /**
     * Transfere as informacoes do controla para o arquivo txt
     */
    public void salvarArquivo() {
        String linha;
        if (bdLinhas.abrirEscrita()) {
            for (int i = 0; i < linhas.size(); i++) {
                Linha aux = linhas.get(i);
                ArrayList<String> freq = aux.getFreq();
                String auxFreq = "";
                for (int j = 0; j < freq.size(); j++) {
                    auxFreq = freq.get(j) + "!" + auxFreq;
                }
                String poltronas[] = aux.getSituacaoPoltronas();
                String auxPoltronas = poltronas[0];
                for (int j = 1; j < poltronas.length; j++) {
                    auxPoltronas = auxPoltronas + "!" + poltronas[j];
                }
                linha = aux.getOnibus() + ";"
                        + aux.getHorario() + ";"
                        + aux.isSituacao() + ";"
                        + auxFreq + ";"
                        + aux.getNumeroLinha() + ";"
                        + auxPoltronas+";"
                        + aux.isExtra();
                bdLinhas.escreverLinha(linha);
            }
        }
        bdLinhas.fecharArquivo();
    }

}
