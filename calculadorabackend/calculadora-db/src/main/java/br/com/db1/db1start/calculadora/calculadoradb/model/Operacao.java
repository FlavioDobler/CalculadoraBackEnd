package br.com.db1.db1start.calculadora.calculadoradb.model;

public enum Operacao {
	SOMA
	{
		@Override
		public Double executor(Double numero1, Double numero2) {
			return numero1 + numero2;
		}
	},
 	SUBTRACAO {
		@Override
		public Double executor(Double numero1, Double numero2) {
			return numero1 - numero2;
		}
	},
	DIVISAO {
		@Override
		public Double executor(Double numero1, Double numero2) {
			return numero1 / numero2;
		}
	},
	MULTIPLICACAO {
		@Override
		public Double executor(Double numero1, Double numero2) {
			return numero1 * numero2;
		}
	};
	
	public abstract Double executor(Double numero1, Double numero2);

}
