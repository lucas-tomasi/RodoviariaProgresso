package classeDeNegocio;

import java.util.ArrayList;

/**
 *
 * @author Lucas Tomasi
 */
public class Linha {

    /**
     * inicia a linha define o codigo automaticamente, a origem e a situacao
     * como TRUE
     */
    public Linha() {
        codigo = ++novoCodigo;
        origem = 1;
        situacao = true;
    }
    static private int novoCodigo;
    private int codigo;
    private String numeroLinha;
    private int origem;
    private String horario;
    private ArrayList<String> freq;
    private int onibus;
    private boolean situacao;
    private ArrayList<Parada> paradas;
    private String situacaoPoltronas[];
    private boolean extra;

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    /**
     * @return o codigo interno da linha
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return o numero da linha
     */
    public String getNumeroLinha() {
        return numeroLinha;
    }

    /**
     * @param numeroLinha numero da linha
     */
    public void setNumeroLinha(String numeroLinha) {
        this.numeroLinha = numeroLinha;
    }

    /**
     * @return o codigo da cidade origem linha
     */
    public int getOrigem() {
        return origem;
    }

    /**
     * @param origem codigo da cidade de origem linha
     */
    public void setOrigem(int origem) {
        this.origem = origem;
    }

    /**
     * @return o horario de saida da linha
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario horario de saida da linha
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return a frequencia da linha [seg,ter,qua,qui,sex,sab,dom]
     */
    public ArrayList<String> getFreq() {
        return freq;
    }

    /**
     * @param freq frequencia da linha [seg,ter,qua,qui,sex,sab,dom]
     */
    public void setFreq(ArrayList<String> freq) {
        this.freq = freq;
    }

    /**
     * @return o codigo do onibus
     */
    public int getOnibus() {
        return onibus;
    }

    /**
     * @param onibus codigo onibus
     */
    public void setOnibus(int onibus) {
        this.onibus = onibus;
    }

    /**
     * @return a situacao da linha TRUE = ativa FALSE = inativa
     */
    public boolean isSituacao() {
        return situacao;
    }

    /**
     * @param situacao situacao da linha TRUE = ativo FALSE = inativo
     */
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    /**
     * 1ª posicao DESTINO FINAL
     *
     * @return as paradas da linha
     */
    public ArrayList<Parada> getParadas() {
        return paradas;
    }

    /**
     * @param paradas ArrayList das paradas da linha
     */
    public void setParadas(ArrayList<Parada> paradas) {
        this.paradas = paradas;
    }

    @Override
    public String toString() {
        return numeroLinha;
    }

    /**
     * 1ª posição é a ultima data de partida e as outras posicoes são maracadas
     * com "L" - livre e "V" - vendida
     *
     * @return a situacao das poltronas do onibuis da linha
     */
    public String[] getSituacaoPoltronas() {
        return situacaoPoltronas;
    }

    /**
     * 1ª posição é a ultima data de partida e as outras posicoes são maracadas
     * com "L" - livre e "V" - vendida
     *
     * @param situacaoPoltronas situacao das poltronas do onibus da linha com a
     * ultima data de partida
     */
    public void setSituacaoPoltronas(String[] situacaoPoltronas) {
        this.situacaoPoltronas = situacaoPoltronas;
    }

}
