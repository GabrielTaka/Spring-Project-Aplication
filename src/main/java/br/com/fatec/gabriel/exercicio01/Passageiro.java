package br.com.fatec.gabriel.exercicio01;

public class Passageiro implements Pessoa{
	
	private String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return  ". Hello " + nome + "!";
	}
	
	
}
