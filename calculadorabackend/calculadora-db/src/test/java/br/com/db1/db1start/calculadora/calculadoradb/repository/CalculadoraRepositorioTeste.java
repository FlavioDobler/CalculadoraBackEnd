package br.com.db1.db1start.calculadora.calculadoradb.repository;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.db1.db1start.calculadora.calculadoradb.model.Calculadora;
import br.com.db1.db1start.calculadora.calculadoradb.model.Operacao;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculadoraRepositorioTeste {
	@Autowired
	private CalculadoraRepositorio calculadoraRepository;

	@After 
	public void after() {
		calculadoraRepository.deleteAll();
	}
	
	@Test
	public void deveSalvarUmNovoCalculo() {
		Calculadora calculadora = new Calculadora(2, 5, Operacao.SOMA);
		calculadoraRepository.save(calculadora);
		
		Assert.assertEquals(7, calculadora.getResultado(), 0);
	}
}
