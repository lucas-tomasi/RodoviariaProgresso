package classeDeNegocio;

/**
 *
 * @author Lucas Tomasi
 */
public class Cidade {

    private static int novoCodigo;
    private int codigo;
    private String nome;
    private String uf;
    private boolean situacao;

    /**
     * inicia a cidade e define o codigo automaticamente e situacao como TRUE
     */
    public Cidade() {
        codigo = ++novoCodigo;
        situacao = true;
    }

    /** 
     * @return o codigo interno da cidade
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return o nome da cidade
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome nome para a cidade
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return a uf da cidade
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf uf da cidade
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return a situacao da cidade;
     * TRUE = ativa, 
     * FALSE = inativa
     */
    public boolean isSituacao() {
        return situacao;
    }

    /**
     * @param situacao situacao para cidade
     * FALSE = inativa
     * TRUE = ativa
     */
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return nome;
    }
}
