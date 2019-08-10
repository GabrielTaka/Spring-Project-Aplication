package br.com.fatec.gabriel.exercicio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Carro {
	
	@Autowired
	@Qualifier("mensagem1")
	private Passageiro passageiro;
	private String cor;
	private String marca;
	private int ano;
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}


	
	public String ler() {
		return "Nome do passageiro" + passageiro.getNome() + "!";
	}
	
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
}
