/**
 * 
 */
package br.ufrn.imd.dominio;

/**
 * @author Claudio
 *
 */
public class SeguroVida implements Tributavel{
	protected int numero;
	protected String beneficiario;
	protected double valor;
	protected double taxa;
	
	public SeguroVida() {
		this.numero = 0;
		this.beneficiario = "";
		this.valor = 0;
		this.taxa = 36;
		
	}
	public SeguroVida(int numero, String beneficiario, double valor) {
		this.numero = numero;
		this.beneficiario = beneficiario;
		this.valor = valor;
		this.taxa = 36;
		
	}
	/**
	 * @return numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero para setar o numero do seguro de vida
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return beneficiario
	 */
	public String getBeneficiario() {
		return beneficiario;
	}
	/**
	 * @param beneficiario para setar o beneficiario do seguro de vida
	 */
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	/**
	 * @return valor
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * @param valor para setar o valor do seguro de vida
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	/**
	 * @return taxa
	 */
	public double getTaxa() {
		return taxa;
	}
	/**
	 * @param taxa para setar a taxa do seguro de vida
	 */
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	/**
	 * @return calculo do tributo em relação ao seguro de vida
	 */
	public double calculaTributos() {
		return this.taxa;
	}
}
