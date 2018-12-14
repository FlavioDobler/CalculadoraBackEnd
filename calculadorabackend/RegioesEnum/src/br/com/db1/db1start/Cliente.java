package br.com.db1.db1start;

public class Cliente {
	private String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public String trataNome(TratamentoNome tratamentoNome) {
		return tratamentoNome.trataNome(this.nome);
	}
}
