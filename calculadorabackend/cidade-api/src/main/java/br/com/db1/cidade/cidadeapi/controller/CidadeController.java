package br.com.db1.cidade.cidadeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.cidade.cidadeapi.model.Cidade;
import br.com.db1.cidade.cidadeapi.model.Uf;
import br.com.db1.cidade.cidadeapi.service.CidadeService;

@RestController
@RequestMapping("/api/cidades")
public class CidadeController {

	@Autowired
	private CidadeService cidadeService;
	
	@GetMapping
	public Cidade salvaCidade(@RequestParam("nome") String nome, @RequestParam("uf") Uf uf) {
		Cidade cidade = cidadeService.salvaCidade(nome,uf);
		return cidade;
	}
}
