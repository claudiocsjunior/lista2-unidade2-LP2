/**
 * 
 */
package br.ufrn.imd.visao;

import br.ufrn.imd.dominio.*;
import br.ufrn.imd.controle.*;

/**
 * @author Claud
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Criação pessoaA, conta e seguro
		Pessoa pessoaA = new Pessoa("Roberto", 500);
		ContaCorrente contaPessoaA = new ContaCorrente("1020-5", "100.231-1");
		SeguroVida seguroPessoaA = new SeguroVida(1, "Maria", 100);
		
		//inserção das contas e seguros a pessoaA
		pessoaA.setConta(contaPessoaA);
		pessoaA.setSeguro(seguroPessoaA);
		
		//depositar dinheiro em conta pessoa A
		pessoaA.getConta().deposita(150);
		
		//_________________________________________________________________________
		
		//Criação pessoaB, conta e seguro
		Pessoa pessoaB = new Pessoa("Madona", 1000);
		ContaCorrente contaPessoaB = new ContaCorrente("2105-4", "123.564-9");
		SeguroVida seguroPessoaB = new SeguroVida(2, "João", 100);
		
		//inserção das contas e seguros a pessoaB
		pessoaB.setConta(contaPessoaB);
		pessoaB.setSeguro(seguroPessoaB);
		
		//depositar dinheiro em conta pessoa B
		pessoaB.getConta().deposita(300);
		
		//_________________________________________________________________________
		
		//Criação pessoaC, conta e seguro
		Pessoa pessoaC = new Pessoa("Chico", 1500);
		ContaCorrente contaPessoaC = new ContaCorrente("3213-4", "890.432-2");
		SeguroVida seguroPessoaC = new SeguroVida(3, "Rosa", 200);
		
		//inserção das contas e seguros a pessoaC
		pessoaC.setConta(contaPessoaC);
		pessoaC.setSeguro(seguroPessoaC);
		
		//depositar dinheiro em conta pessoaC
		pessoaC.getConta().deposita(500);
		
		//__________________________________________________________________________
		
		//gerenciamento de pessoas
		DAOPessoa gerenciamentoPessoas = new DAOPessoa();
		gerenciamentoPessoas.cadastrarPessoa(pessoaA);
		gerenciamentoPessoas.cadastrarPessoa(pessoaB);
		gerenciamentoPessoas.cadastrarPessoa(pessoaC);
		gerenciamentoPessoas.listarPessoa();
	}

}
