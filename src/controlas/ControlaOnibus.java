package controlas;

import classeDeNegocio.Linha;
import classeDeNegocio.Onibus;
import classesDeAjuda.Arquivo;
import janelas.JanelaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Lucas Tomasi
 */
public class ControlaOnibus {

    ArrayList<Onibus> onibus;
    Arquivo bdOnibus;

    /**
     * inicia o array de onibus e abre o "bdOnibus.txt"
     */
    public ControlaOnibus() {
        onibus = new ArrayList<>();
        bdOnibus = new Arquivo("bdOnibus.txt");
        abrirArquivo();
    }

    /**
     * salva no array e no arquivo txt
     *
     * @param novoOnibus onibus a ser inserido     
     */
    public void inserir(Onibus novoOnibus) {
        onibus.add(novoOnibus);
        salvarArquivo();
    }

    /**
     *
     * @return todos os onibus
     */
    public ArrayList<Onibus> listar() {
        return onibus;
    }

    /**
     *
     * @param onibus array de onibus para filtrar
     * @param situacao situacao para filtro
     * @return array de onibus com a situcao
     */
    public ArrayList<Onibus> listar(ArrayList<Onibus> onibus, boolean situacao) {
        ArrayList<Onibus> auxListar = new ArrayList<>();
        for (int i = 0; i < onibus.size(); i++) {
            if (onibus.get(i).isSituacao() == situacao) {
                auxListar.add(onibus.get(i));
            }
        }
        return auxListar;
    }

    /**
     *
     * @param onibus array de onibus para filtrar
     * @param banheiro situacao TRUE = com banheiro FALSE = sem banheiro para
     * filtro
     * @return array de onibus com banheiro
     */
    public ArrayList<Onibus> listar(boolean banheiro, ArrayList<Onibus> onibus) {
        ArrayList<Onibus> auxListar = new ArrayList<>();
        for (int i = 0; i < onibus.size(); i++) {
            if (onibus.get(i).isBanheiro() == banheiro) {
                auxListar.add(auxListar.get(i));
            }
        }
        return auxListar;
    }

    /**
     *
     * @param situacao situacao do onibus TRUE = ativos FALSE = inativos
     * @return todos os onibus com a situacao
     */
    public ArrayList<Onibus> listar(boolean situacao) {
        ArrayList<Onibus> auxListar = new ArrayList<>();
        for (int i = 0; i < onibus.size(); i++) {
            if (onibus.get(i).isSituacao() == situacao) {
                auxListar.add(onibus.get(i));
            }
        }
        return auxListar;
    }

    /**
     *
     * @param onibus array de onibus para filtar
     * @param assentos
     * @return
     */
    public ArrayList<Onibus> listar(ArrayList<Onibus> onibus, int assentos) {
        ArrayList<Onibus> auxListar = new ArrayList<>();
        for (int i = 0; i < onibus.size(); i++) {
            if (onibus.get(i).getAssentos() == assentos) {
                auxListar.add(onibus.get(i));
            }
        }
        return auxListar;
    }

    /**
     *
     * @param descricao descricao/numeroLinha para filtrar
     * @return todos onibus com a descricao
     */
    public ArrayList<Onibus> listar(String descricao) {
        ArrayList<Onibus> auxListar = new ArrayList<>();
        for (int i = 0; i < onibus.size(); i++) {
            if (onibus.get(i).getNumeroOnibus().toLowerCase().contains(descricao.toLowerCase())) {
                auxListar.add(onibus.get(i));
            }
        }
        return auxListar;
    }

    /**
     *
     * @param codigoOnibus codigo do onibus para procurar
     * @return o onibus que contem esse codigo
     */
    public Onibus buscar(int codigoOnibus) {
        for (int i = 0; i < onibus.size(); i++) {
            if (onibus.get(i).getCodigo() == codigoOnibus) {
                return onibus.get(i);
            }
        }
        return null;
    }

    /**
     * inativa todas as linhas que contenham esse onibus
     *
     * @param onibus onibus para ser inativado
     */
    public void inativar(Onibus onibus) {
        ArrayList<Linha> aux = JanelaPrincipal.ctlLinha.listar(onibus);
        for (int i = 0; i < aux.size(); i++) {
            aux.get(i).setSituacao(false);
        }
        onibus.setSituacao(false);
        JanelaPrincipal.ctlLinha.salvarArquivo();
    }

    /**
     * @param numeroOnibus numeroOnibus para verificar se nome ja existe
     * @param onibus onibus para descartar da verificação
     * @return TRUE = nenhum onibus com o mesmo numero FALSE = numero já
     * existente em outro onibus
     */
    public boolean verificarNome(Onibus onibus, String numeroOnibus, boolean executivo) {
        for (int i = 0; i < this.onibus.size(); i++) {
            if (!this.onibus.get(i).equals(onibus)) {
                if (this.onibus.get(i).getNumeroOnibus().equalsIgnoreCase(numeroOnibus) && this.onibus.get(i).isExecutivo() == executivo) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Abre o arquivo txt e insere as informacoes no controla
     */
    private void abrirArquivo() {
        if (bdOnibus.abrirLeitura()) {
            ArrayList<String> bdOnibus = this.bdOnibus.lerLinhas();
            for (int i = 0; i < bdOnibus.size(); i++) {
                String linha[] = bdOnibus.get(i).split(";");
                Onibus aux = new Onibus();
                aux.setNumeroOnibus(linha[0]);
                aux.setAssentos(Integer.valueOf(linha[1]));
                aux.setBanheiro(Boolean.valueOf(linha[2]));
                aux.setSituacao(Boolean.valueOf(linha[3]));
                aux.setExecutivo(Boolean.parseBoolean(linha[4]));
                onibus.add(aux);
            }
        }
        bdOnibus.fecharArquivo();
    }

    /**
     * Transefer as informacoes do controla para o arquivo txt
     */
    public void salvarArquivo() {
        if (bdOnibus.abrirEscrita()) {
            String linha;
            for (int i = 0; i < onibus.size(); i++) {
                Onibus aux = onibus.get(i);
                linha = aux.getNumeroOnibus() + ";" + aux.getAssentos() + ";" + aux.isBanheiro() + ";" + aux.isSituacao()+";"+aux.isExecutivo();
                bdOnibus.escreverLinha(linha);
            }
        }
        bdOnibus.fecharArquivo();
    }
}
