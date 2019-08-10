package br.com.fatec.gabriel.exercicio01;

public class HelloWorld implements Menssagem{
	
	private String nome;
	
	public HelloWorld() {
	}
	
	/**
	 * Setter do atributo nome
	 * @param nome Um nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMenssagem() {
		// TODO Auto-generated method stub
		return "Hello World! Hello " + nome + "!";
	}
	
}
