package controlas;

import classeDeNegocio.Linha;
import classeDeNegocio.Parada;
import classesDeAjuda.Arquivo;
import java.util.ArrayList;

/**
 *
 * @author Lucas Tomasi
 */
public class ControlaParadas {

    ArrayList<Parada> paradas;
    Arquivo bdParadas;

    /**
     * inicia o array de paradas e abre o arquivo de bdParadas
     */
    public ControlaParadas() {
        paradas = new ArrayList<>();
        bdParadas = new Arquivo("bdParadas.txt");
        abrirArquivo();
    }

    /**
     * remove todas as paradas da linha
     *
     * @param linha linha para remover paradas
     */
    public void removerParadasLinha(Linha linha) {
        ArrayList<Parada> paradasParaRemocao = new ArrayList<>();
        for (int p = 0; p < paradas.size(); p++) {
            if (paradas.get(p).getCodigoLinha() == linha.getCodigo()) {
                paradasParaRemocao.add(paradas.get(p));
            }
        }
        paradas.removeAll(paradasParaRemocao);
    }

    /**
     * insere paradas e array e salva o arquivo txt
     *
     * @param novasParadasLinha array de paradas da linha
     */
    public void inserir(ArrayList<Parada> novasParadasLinha) {
        for (int i = 0; i < novasParadasLinha.size(); i++) {
            paradas.add(novasParadasLinha.get(i));
        }
        salvarArquivo();
    }

    /**
     *
     * @param codigoLinha codigo da linha para buscar paradas
     * @return retorna todas as paradas da linha
     */
    public ArrayList<Parada> buscar(int codigoLinha) {
        ArrayList<Parada> auxBusca = new ArrayList<>();
        for (int i = 0; i < paradas.size(); i++) {
            if (paradas.get(i).getCodigoLinha() == codigoLinha) {
                auxBusca.add(paradas.get(i));
            }
        }
        return auxBusca;
    }

    /**
     *
     * @param codigoParada
     * @param codigoLinha
     * @return retorna o valor da parada
     */
    public double getValorParada(int codigoParada, int codigoLinha) {
        for (int i = 0; i < paradas.size(); i++) {
            Parada parada = paradas.get(i);
            if (parada.getCodigoLinha() == codigoLinha && parada.getParada() == codigoParada) {
                return parada.getValor();
            }
        }
        return 0.00;
    }

    /**
     * transfere o conteudo do array para o arquivo txt
     */
    private void salvarArquivo() {
        if (bdParadas.abrirEscrita()) {
            for (int i = 0; i < paradas.size(); i++) {
                Parada aux = paradas.get(i);
                String linha = aux.getCodigoLinha() + ";" + aux.getParada() + ";" + aux.getTipo() + ";" + aux.getValor();
                bdParadas.escreverLinha(linha);
            }
        }
        bdParadas.fecharArquivo();
    }

    /**
     * trasnfere o conteudo do arquivo txt para o array
     */
    private void abrirArquivo() {
        if (bdParadas.abrirLeitura()) {
            ArrayList<String> paradas = bdParadas.lerLinhas();
            for (int i = 0; i < paradas.size(); i++) {
                String parada[] = paradas.get(i).split(";");
                Parada novaParada = new Parada();
                novaParada.setCodigoLinha(Integer.parseInt(parada[0]));
                novaParada.setParada(Integer.parseInt(parada[1]));
                novaParada.setTipo(parada[2]);
                novaParada.setValor(Double.parseDouble(parada[3]));
                this.paradas.add(novaParada);
            }
        }
        bdParadas.fecharArquivo();
    }

}
