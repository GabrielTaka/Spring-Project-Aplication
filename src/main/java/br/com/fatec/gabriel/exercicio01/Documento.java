package br.com.fatec.gabriel.exercicio01;

public class Documento implements DocumentoInterface{
	
	private String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return "Diploma -> " + nome + "!";
	}
	
	
	
	
}
