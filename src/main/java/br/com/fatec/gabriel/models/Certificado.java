package br.com.fatec.gabriel.models;

import br.com.fatec.gabriel.interfaces.Documento;

public class Certificado implements Documento{
	
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

	public String getDocumento() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
