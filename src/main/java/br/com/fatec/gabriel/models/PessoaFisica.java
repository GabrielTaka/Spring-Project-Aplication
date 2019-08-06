package br.com.fatec.gabriel.models;

import br.com.fatec.gabriel.interfaces.Pessoa;

public class PessoaFisica implements Pessoa{
	
	private String nome;
	private String ultimoNome;
	private int idade;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUltimoNome() {
		return ultimoNome;
	}
	
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPessoa() {
		// TODO Auto-generated method stub
		return null;
	}
}
