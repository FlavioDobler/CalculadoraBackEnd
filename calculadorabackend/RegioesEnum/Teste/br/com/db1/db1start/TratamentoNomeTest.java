package br.com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class TratamentoNomeTest {
	@Test
	public void deveRetornarMaiusculo() {
		Cliente cliente = new Cliente("Marvin");
		Assert.assertEquals("MARVIN", cliente.trataNome(TratamentoNome.UPPERCASE));
	}
	
	@Test
	public void deveRetornarMinusculo() {
		Cliente cliente = new Cliente("Marvin");
		Assert.assertEquals("marvin", cliente.trataNome(TratamentoNome.LOWERCASE));
	}
	
	@Test
	public void deveRetornarAsQuatroPrimeirasLetras() {
		Cliente cliente = new Cliente("Marvin");
		Assert.assertEquals("Marv", cliente.trataNome(TratamentoNome.QUATRO_PRIMEIRAS_LETRAS));
	}
}
