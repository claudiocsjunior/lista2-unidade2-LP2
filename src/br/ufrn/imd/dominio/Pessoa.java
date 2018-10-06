package br.ufrn.imd.dominio;

/**
 * @author Claudio
 *
 */
public class Pessoa implements Tributavel{
	protected String nome;
	protected double salario;
	private SeguroVida seguro;
	private ContaCorrente conta;
	
	public Pessoa(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
		this.seguro = new SeguroVida();
		this.conta = new ContaCorrente();
	}
	/**
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome para modificar o nome da pessoa
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @param salario para setar o salario da pessoa
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	/**
	 * @return seguro
	 */
	public SeguroVida getSeguro() {
		return seguro;
	}
	/**
	 * @param seguro para setar o seguro da pessoa
	 */
	public void setSeguro(SeguroVida seguro) {
		this.seguro = seguro;
	}
	/**
	 * @return conta
	 */
	public ContaCorrente getConta() {
		return conta;
	}
	/**
	 * @param conta para setar a conta da pessoa
	 */
	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}
	
	/**
	 * @return stributos da pessoa
	 */
	public double calculaTributos() {
		return this.salario * 0.11;
	}
	
	
	
}
