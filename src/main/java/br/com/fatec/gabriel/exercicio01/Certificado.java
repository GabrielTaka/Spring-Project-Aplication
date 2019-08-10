package br.com.fatec.gabriel.exercicio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Certificado {
	
	@Autowired
	@Qualifier("mensagem3")
	private Documento nome;
	private int anoDeEmissao;
	private String nomeDoFormado;
	private int idade; 
	
	public int getAnoDeEmissao() {
		return anoDeEmissao;
	}

	public void setAnoDeEmissao(int anoDeEmissao) {
		this.anoDeEmissao = anoDeEmissao;
	}

	public String getNomeDoFormado() {
		return nomeDoFormado;
	}

	public void setNomeDoFormado(String nomeDoFormado) {
		this.nomeDoFormado = nomeDoFormado;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String ler() {
		return "Documento -> " + nome.getNome();
	}
	
	public void setNome(Documento nome) {
		this.nome = nome;
	}
}
