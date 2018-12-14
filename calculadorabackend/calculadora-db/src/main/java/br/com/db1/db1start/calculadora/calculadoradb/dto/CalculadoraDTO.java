package br.com.db1.db1start.calculadora.calculadoradb.dto;

import br.com.db1.db1start.calculadora.calculadoradb.model.Operacao;

public class CalculadoraDTO {

	private Operacao operacao;
	
	private double numeroUm;
	
	private double numeroDois;

	public Operacao getOperacao() {
		return operacao;
	}

	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}

	public double getNumeroUm() {
		return numeroUm;
	}

	public void setNumeroUm(double numeroUm) {
		this.numeroUm = numeroUm;
	}

	public double getNumeroDois() {
		return numeroDois;
	}

	public void setNumeroDois(double numeroDois) {
		this.numeroDois = numeroDois;
	}

	
	
	
	
}
