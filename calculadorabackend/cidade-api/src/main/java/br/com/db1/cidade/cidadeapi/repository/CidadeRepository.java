package br.com.db1.cidade.cidadeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.db1.cidade.cidadeapi.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
}