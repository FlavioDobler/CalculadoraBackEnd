package br.com.db1.db1start;

public class Calculadora {
	private Double numero1;
	private Double numero2;
	
	public Calculadora(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public double realizaOperacaoMatematica(Operacao operacao) {
		return operacao.executor(this.numero1, this.numero2);
	}
}
