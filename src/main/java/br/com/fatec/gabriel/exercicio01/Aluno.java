package br.com.fatec.gabriel.exercicio01;

public class Aluno implements AlunoPessoa{
	
	private String nome;

	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNome() {
		return "Olá" + nome + "!";
	}
	
	
	
}
