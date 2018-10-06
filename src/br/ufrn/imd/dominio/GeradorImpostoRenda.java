/**
 * 
 */
package br.ufrn.imd.dominio;

/**
 * @author Claud
 *
 */
public class GeradorImpostoRenda {
	private double totalTributo;
	
	/**
	 * @param tributo do salario
	 * @param tributo da conta corrente
	 * @param tributo do seguro de vida
	 */
	public GeradorImpostoRenda(double tributoSalario, double tributoConta, double tributoSeguro) {
		this.totalTributo = tributoSalario + tributoConta + tributoSeguro;
	}
	
	/**
	 * @return valor total do tributo
	 */
	public double calculaValorTotalTributo(){
		return this.totalTributo;
	}
}
