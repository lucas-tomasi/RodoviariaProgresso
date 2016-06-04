package classeDeNegocio;

/**
 *
 * @author Lucas Tomasi
 */
public class Parada {
        private int codigoLinha;
	private int parada;  
	private double valor; 
        private String tipo; 

    /**
     * @return o codigo da cidade
     */
    public int getParada() {
        return parada;
    }

    /**
     * @param parada o codigo da cidade
     */
    public void setParada(int parada) {
        this.parada = parada;
    }

    /**
     * @return o valor da passagem ate a "parada" da linha 
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor valor da "parada" em relacao a linha
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return o tipo da parada DESTINO = destino final da linha PARADA = paradas que onibus ira fazer na linha
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo DESTINO = destino final da linha PARADA = paradas que onibus ira fazer na linha
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return o codigo da linha que a parada pertence
     */
    public int getCodigoLinha() {
        return codigoLinha;
    }

    /**
     * @param codigoLinha codigo da linha
     */
    public void setCodigoLinha(int codigoLinha) {
        this.codigoLinha = codigoLinha;
    }
    
}
