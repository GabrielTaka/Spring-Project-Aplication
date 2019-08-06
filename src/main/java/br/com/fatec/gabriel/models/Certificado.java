package br.com.fatec.gabriel.models;

public class Certificado {
	private String instituicao;
	private int anoDeConclusao;
	private int anoDeInicio;
	private String nome;
	
	public String getInstituicao() {
		return instituicao;
	}
	
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	public int getAnoDeConclusao() {
		return anoDeConclusao;
	}
	
	public void setAnoDeConclusao(int anoDeConclusao) {
		this.anoDeConclusao = anoDeConclusao;
	}
	
	public int getAnoDeInicio() {
		return anoDeInicio;
	}
	
	public void setAnoDeInicio(int anoDeInicio) {
		this.anoDeInicio = anoDeInicio;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
