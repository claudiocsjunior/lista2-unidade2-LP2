/**
 * 
 */
package br.ufrn.imd.dominio;

/**
 * @author Claudio
 *
 */
public class ContaCorrente implements Tributavel{
	protected String agencia;
	protected String numero;
	protected double saldo;
	
	public ContaCorrente() {
		this.agencia = "";
		this.numero = "";
		this.saldo = 0;
	}
	
	/**
	 * @return agencia
	 */
	public String getAgencia() {
		return agencia;
	}

	/**
	 * @return numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param agencia da conta
	 * @param numero da conta
	 */
	public ContaCorrente(String agencia, String numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
	}
	
	/**
	 * @param valor de saque
	 */
	public void saca(double valor) {
		if(valor > 0) {
			if(valor <= this.saldo) {
				this.saldo -= valor;
				System.out.println("Saque efetuado com sucesso.");
			}else {
				System.out.println("Saldo insuficiente para saque.");
			}
		}else {
			System.out.println("Valor inv�lido para saque.");
		}
	}
	
	/**
	 * @param Valor de dep�sito
	 */
	public void deposita(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			System.out.println("dep�sito efetuado com sucesso.");
		}else {
			System.out.println("Valor inv�lido para dep�sito");
		}
	}
	
	/**
	 * @param valor de transfer�ncia
	 * @param Conta para transfer�ncia
	 * @return Booleano
	 */
	public boolean transfere(double valor, ContaCorrente cc) {
		if(valor > 0 && valor <= this.saldo) {
			this.saca(valor);
			cc.deposita(valor);
			return true;
		}
		return false;
	}
	
	/**
	 * @return tributos em rela��o a con corrente
	 */
	public double calculaTributos() {
		return saldo * 0.055;
	}

}
