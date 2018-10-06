/**
 * 
 */
package br.ufrn.imd.controle;
import br.ufrn.imd.dominio.*;
import java.util.ArrayList;

/**
 * @author Claudio
 *
 */
public class DAOPessoa {
	ArrayList<Pessoa> pessoas;
	
	public DAOPessoa() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	/**
	 * @param pessoa para efetuar o cadastro
	 */
	public void cadastrarPessoa(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}
	
	
	public void listarPessoa() {
		for(Pessoa pessoa : this.pessoas) {
			GeradorImpostoRenda geradorImposto = new GeradorImpostoRenda(pessoa.calculaTributos(), pessoa.getConta().calculaTributos(), pessoa.getSeguro().calculaTributos());
			System.out.println("************************************************************************");
			System.out.println("Nome...: " + pessoa.getNome() + "   Salario...: " + pessoa.getSalario());
			System.out.println("Agência: " + pessoa.getConta().getAgencia() + "   Conta.: " + pessoa.getConta().getNumero() + "   Saldo.: " + pessoa.getConta().getSaldo());
			System.out.println("Seguro.: " + pessoa.getSeguro().getNumero() + "   Beneficiário: " + pessoa.getSeguro().getBeneficiario());
			System.out.println("************************************************************************");
			System.out.println("IRPF...: " + geradorImposto.calculaValorTotalTributo());
			System.out.println("************************************************************************");
		}
	}
}
