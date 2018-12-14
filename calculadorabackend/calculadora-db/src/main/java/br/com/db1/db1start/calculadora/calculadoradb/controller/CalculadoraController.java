package br.com.db1.db1start.calculadora.calculadoradb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.db1start.calculadora.calculadoradb.dto.CalculadoraDTO;
import br.com.db1.db1start.calculadora.calculadoradb.model.Calculadora;
import br.com.db1.db1start.calculadora.calculadoradb.model.Operacao;
import br.com.db1.db1start.calculadora.calculadoradb.service.CalculadoraService;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {

	@Autowired
	private CalculadoraService calculadoraService;
	
	@PostMapping
	public Calculadora post(@RequestBody CalculadoraDTO calculadora) {
		return calculadoraService.salvaCalculo(calculadora.getNumeroDois(),
				calculadora.getNumeroUm(),
				calculadora.getOperacao());
	}
	
	@GetMapping
	public List<Calculadora> todosCalculos(){
		return calculadoraService.buscarTodosCalculos();
	}
}
