package br.com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class RegiaoTest {
	
	@Test
	public void deveRetornarRegioes(){
		Uf[] ufs = Regiao.SUL.getUf();
		Assert.assertArrayEquals(new Uf[] {Uf.PR, Uf.SC } ,ufs );
	}
}
