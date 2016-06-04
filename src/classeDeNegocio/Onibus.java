package classeDeNegocio;

/**
 *
 * @author Lucas Tomasi
 */
public class Onibus {

    static int novoCodigo;
    private int codigo;		
    private String numeroOnibus;	
    private int assentos; 
    private boolean banheiro; 
    private boolean situacao; 
    private boolean executivo;

    /**
     * inicia onibus e define o codigo automaticamente e situacao como TRUE
     */
    public Onibus() {
        codigo = ++novoCodigo;
        situacao = true;
    }

    /**
     * @return codigo interno do onibus
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return o numero do onibus
     */
    public String getNumeroOnibus() {
        return numeroOnibus;
    }

    /**
     * @param numeroOnibus  numero do onibus
     */
    public void setNumeroOnibus(String numeroOnibus) {
        this.numeroOnibus = numeroOnibus;
    }

    /**
     * @return o numero de assentos do onibus
     */
    public int getAssentos() {
        return assentos;
    }

    /**
     * @param assentos numero de assentos do onibus
     */
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    /**
     * @return a disponibilidade de banheiro, TRUE = com banheiro FALSE = sem banheiro
     */
    public boolean isBanheiro() {
        return banheiro;
    }

    /**
     * @param banheiro TRUE = com banheiro FALSE = sem banheiro
     */
    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }

    /**
     * @return a situacao do onibus, TRUE = ativo FALSE = sem banheiro
     */
    public boolean isSituacao() {
        return situacao;
    }

    /**
     * @param situacao  TRUE = ativo FALSE = sem banheiro
     */
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString (){
        return numeroOnibus;
    }

    /**
     * @return the executivo
     */
    public boolean isExecutivo() {
        return executivo;
    }

    /**
     * @param executivo the executivo to set
     */
    public void setExecutivo(boolean executivo) {
        this.executivo = executivo;
    }
}
