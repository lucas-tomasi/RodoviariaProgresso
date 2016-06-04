package controlas;

import classeDeNegocio.Cidade;
import classeDeNegocio.Linha;
import classesDeAjuda.Arquivo;
import janelas.JanelaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Lucas Tomasi
 */
public class ControlaCidades {

    static ArrayList<Cidade> cidades;
    Arquivo bdCidades;

    /**
     * inicia o array de cidades e abre o arquivo "bdCidade.txt"
     */
    public ControlaCidades() {
        cidades = new ArrayList<>();
        bdCidades = new Arquivo("bdCidades.txt");
        abrirArquivo();
    }

    /**
     * inativa tambem todas as linhas que contenham essa cidade
     * @param cidade cidade a ser inativada
     */
    public void inativar(Cidade cidade) {
        cidade.setSituacao(false);
        ArrayList<Linha> linhas = JanelaPrincipal.ctlLinha.procurarParadas(cidade.getCodigo());
        for (int i = 0; i < linhas.size(); i++) {
            linhas.get(i).setSituacao(false);
        }
        JanelaPrincipal.ctlLinha.salvarArquivo();
    }

    /**
     * salva cidade no array e no arquivo txt
     *
     * @param novaCidade cidade a ser inserida   
     */
    public void inserir(Cidade novaCidade) {        
        cidades.add(novaCidade);
        salvarArquivo();
    }

    /**
     * @param ufCidade uf para verificar se a cidade ja exsiste
     * @param nomeCidade nome para verificar se a cidade ja exsiste
     * @param cidade cidade para descartar verificação
     * @return TRUE = se nao existe cidade cadastrada com esse nome FALSE = se
     * ja existe uma cidade com o mesmo nome e uf
     */
    public boolean verificarNomeCidade(Cidade cidade,String ufCidade, String nomeCidade ) {
        for (int i = 0; i < cidades.size(); i++) {
            if (!cidades.get(i).equals(cidade)) {
                if ((cidades.get(i).getNome().equalsIgnoreCase(nomeCidade)) && (cidades.get(i).getUf().equalsIgnoreCase(ufCidade))) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     *
     * @return todas as cidades
     */
    public ArrayList<Cidade> listar() {
        return cidades;
    }

    /**
     *
     * @param situacao situacao da cidade TRUE = ativa FALSE = inativa
     * @return todas as cidades com a "situacao"
     */
    public ArrayList<Cidade> listar(boolean situacao) {
        ArrayList<Cidade> auxListar = new ArrayList<>();
        for (int i = 0; i < cidades.size(); i++) {
            if (cidades.get(i).isSituacao() == situacao) {
                auxListar.add(cidades.get(i));
            }
        }
        return auxListar;
    }

    /**
     *
     * @param codigoCidade codigo da cidade que deseja buscar
     * @return a cidade que tem o codigo ou 'null' se nao encontrar nada
     */
    public Cidade buscar(int codigoCidade) {
        for (int i = 0; i < cidades.size(); i++) {
            if (cidades.get(i).getCodigo() == codigoCidade) {
                return cidades.get(i);
            }
        }
        return null;
    }

    /**
     *
     * @param descricao descricao para efetuar a busca
     * @return todas as cidades com a descricao passada
     */
    public ArrayList<Cidade> listar(String descricao) {
        ArrayList<Cidade> auxListar = new ArrayList<>();
        for (int i = 0; i < cidades.size(); i++) {
            if (cidades.get(i).getNome().toLowerCase().contains(descricao.toLowerCase())) {
                auxListar.add(cidades.get(i));
            }
        }
        return auxListar;
    }

    /**
     *
     * @param descricao descricao para filtro
     * @param cidades array de cidades para filtrar
     * @return array de cidades com a descricao
     */
    public ArrayList<Cidade> listar(String descricao, ArrayList<Cidade> cidades) {
        ArrayList<Cidade> auxListar = new ArrayList<>();
        for (int i = 0; i < cidades.size(); i++) {
            if (cidades.get(i).getNome().toLowerCase().contains(descricao.toLowerCase())) {
                auxListar.add(cidades.get(i));
            }
        }
        return auxListar;
    }

    /**
     * Abre o arquivo texto e insere as cidades no controla
     */
    private void abrirArquivo() {
        if (bdCidades.abrirLeitura()) {
            ArrayList<String> aux = bdCidades.lerLinhas();
            for (int i = 0; i < aux.size(); i++) {
                String linha = aux.get(i);
                String lAux[] = linha.split(";");
                Cidade novaCidade = new Cidade();
                novaCidade.setNome(lAux[0]);
                novaCidade.setUf(lAux[1]);
                novaCidade.setSituacao(Boolean.parseBoolean(lAux[2]));
                bdCidades.fecharArquivo();
                cidades.add(novaCidade);
            }
        }
        bdCidades.fecharArquivo();
    }

    /**
     * Transfere as informacoes do controla para o arquivo txt
     */
    public void salvarArquivo() {
        if (bdCidades.abrirEscrita()) {
            for (int i = 0; i < cidades.size(); i++) {
                Cidade aux = cidades.get(i);
                String linha = aux.getNome() + ";" + aux.getUf() + ";" + aux.isSituacao();
                bdCidades.escreverLinha(linha);
            }
        }
        bdCidades.fecharArquivo();
    }
}
