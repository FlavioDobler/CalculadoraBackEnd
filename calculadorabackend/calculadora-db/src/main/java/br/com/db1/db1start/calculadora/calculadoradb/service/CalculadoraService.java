package br.com.db1.db1start.calculadora.calculadoradb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.db1start.calculadora.calculadoradb.model.Calculadora;
import br.com.db1.db1start.calculadora.calculadoradb.model.Operacao;
import br.com.db1.db1start.calculadora.calculadoradb.repository.CalculadoraRepositorio;

@Service
public class CalculadoraService {

	@Autowired
	private CalculadoraRepositorio calculadoraRepository;
	
	public Calculadora salvaCalculo(double numeroUm , double numeroDois, Operacao operacao) {
		Calculadora calculadora = new Calculadora(numeroUm,numeroDois,operacao);
		calculadoraRepository.save(calculadora);
		return calculadora;
	}

	public List<Calculadora> buscarTodosCalculos() {
		return calculadoraRepository.findAll();
	}



}

