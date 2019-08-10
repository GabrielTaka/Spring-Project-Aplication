package br.com.fatec.gabriel.exercicio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class Placa {
	
	@Autowired
	@Qualifier("mensagem1")
	private Menssagem menssagem;
	
	private int ano;
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String ler() {
		return "[ <" + menssagem.getMenssagem() + "> ]";
	}
	
	public void setMensagem(Menssagem mensagem) {
		this.menssagem = mensagem;
	}
	
}
