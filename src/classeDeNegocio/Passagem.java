package classeDeNegocio;

/**
 *
 * @author Lucas Tomasi
 */
public class Passagem {

    /**
     * inicia a passagem e define o codigo automaticamente e a situacao como 'V' vendida
     */
    public Passagem() {
        codigo = ++novoCodigo;
        situacao = 'V';
    }
    
    
static  int novoCodigo;							
	private int codigo;							
	private int linha;
        private String destino;
        private String parada;
	private String data;							
	private String  hora;							
	private boolean seguro;							
        private double valorSeguro;
        private double valorTotal;
        private double valorParada;
        private int poltrona;
        private char situacao;   

    /**
     * @return o codigo da passagem
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo codigo sequencial da passagem
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return o codigo da linha da passagem
     */
    public int getLinha() {
        return linha;
    }

    /**
     * @param linha codigo da linha da passagem
     */
    public void setLinha(int linha) {
        this.linha = linha;
    }

    /**
     * @return a data da venda da passagem
     */
    public String getData() {
        return data;
    }

    /**
     * @param data data da venda da passagem
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return a hora da venda da passagem
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora hora da venda da passagem
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return status do seguro TRUE = passagem com seguro FALSE = passagem sem seguro
     */
    public boolean isSeguro() {
        return seguro;
    }

    /**
     * @param seguro TRUE = passagem com seguro FALSE = passagem sem seguro
     */
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    /**
     * @return o valor do seguro da passagem
     */
    public double getValorSeguro() {
        return valorSeguro;
    }

    /**
     * @param valorSeguro valor do seguro da passagem
     */
    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    /**
     * @return o valor do seguro + valor da parada
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal valor do seguro + valor da parada
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return a situacao da passagem 'C' = cancelada 'V' = vendida
     */
    public char getSituacao() {
        return situacao;
    }

    /**
     * @param situacao 'C' = cancelada 'V' = vendida
     */
    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }

    /**
     * @return o valor da parada 
     */
    public double getValorParada() {
        return valorParada;
    }

    /**
     * @param valorParada valor da parada da linha
     */
    public void setValorParada(double valorParada) {
        this.valorParada = valorParada;
    }

    /**
     * @return o numero da poltrona da passagem
     */
    public int getPoltrona() {
        return poltrona;
    }

    /**
     * @param poltrona numero da poltrona da passagem
     */
    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    /**
     * @return o nome da cidade de destino final da linha
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino nome da cidade de destino final da linha
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return a cidade em que o passageiro irá desembarcar
     */
    public String getParada() {
        return parada;
    }

    /**
     * @param parada cidade em que o passageiro irá desembarcar
     */
    public void setParada(String parada) {
        this.parada = parada;
    }
        
}
