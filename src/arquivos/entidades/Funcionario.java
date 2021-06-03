package arquivos.entidades;

public class Funcionario implements Comparable<Funcionario> {

	private String nome;
	private int idade;
	private double salario;
	
	public Funcionario(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " Idade: " + this.idade + " Sal�rio: " + this.salario;
	}

	@Override
	public int compareTo(Funcionario funcionario) {
		/*
		 * Realiza ordena��o atrav�s do atributo selecionado
		 */
		return this.nome.compareTo(funcionario.nome);
	}
	
}
