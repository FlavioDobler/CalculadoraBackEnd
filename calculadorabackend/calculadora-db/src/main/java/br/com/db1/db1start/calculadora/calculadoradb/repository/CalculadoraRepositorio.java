package br.com.db1.db1start.calculadora.calculadoradb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.db1.db1start.calculadora.calculadoradb.model.Calculadora;

public interface CalculadoraRepositorio extends JpaRepository<Calculadora, Long>{

}