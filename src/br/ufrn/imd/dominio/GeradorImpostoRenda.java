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
	
	public GeradorImpostoRenda(double tributoSalario, double tributoConta, double tributoSeguro) {
		this.totalTributo = tributoSalario + tributoConta + tributoSeguro;
	}
	
	public double calculaValorTotalTributo(){
		return this.totalTributo;
	}
}
