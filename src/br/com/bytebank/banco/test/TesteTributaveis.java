package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333, 424);
		cc.deposita(100);

		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calculador = new CalculadorImposto();
		calculador.registra(cc);
		calculador.registra(seguro);
		
		System.out.println(calculador.getTotalImposto());
	}

}
