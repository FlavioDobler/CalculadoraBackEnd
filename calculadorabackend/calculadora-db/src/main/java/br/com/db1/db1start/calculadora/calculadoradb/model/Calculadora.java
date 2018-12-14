package br.com.db1.db1start.calculadora.calculadoradb.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "calculadora")
public class Calculadora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numeroUm", nullable = false)
	private Double numeroUm;
	
	@Column(name = "numeroDois", nullable = false)
	private Double numeroDois;

	
	@Enumerated(EnumType.STRING)
	@Column(name = "operacao", nullable = false)
	private Operacao operacao;

	@Column(name = "data", nullable = false)
	private LocalDateTime dataOperacao;

	
	@Column(name = "resultado", nullable = false)
	private Double resultado;

	
	public Calculadora(double numeroUm, double numeroDois,Operacao operacao) {
		this.numeroUm = numeroUm;
		this.numeroDois = numeroDois;
		this.operacao = operacao;
		this.realizaOperacaoMatematica();
		this.dataOperacao = LocalDateTime.now();
	}	
	
	public Calculadora() {
	}
	
	public Double getNumeroUm() {
		return this.numeroUm;
	}
	
	public Double getNumeroDois() {
		return this.numeroDois;
	}
	
	public Operacao getOperacao() {
		return this.operacao;
	}	
	
	public LocalDateTime getDataOperacao() {
		return this.dataOperacao;
	}
	
	public Double getResultado() {
		return this.resultado;
	}
	
	public void realizaOperacaoMatematica(){
		this.resultado = this.operacao.executor(this.numeroUm, this.numeroDois);
	}
	
	
}
