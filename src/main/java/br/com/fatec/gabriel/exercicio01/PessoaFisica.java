package br.com.fatec.gabriel.exercicio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PessoaFisica {
	
	@Autowired
	@Qualifier("mensagem2")
	private Aluno nome;
	private int idade;
	private String cidade;
	private String profissao;
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public void setNome(Aluno nome) {
		this.nome = nome;
	}
	
	public String ler() {
		return "Bem vindo.  " + nome.getNome();
	}
}
