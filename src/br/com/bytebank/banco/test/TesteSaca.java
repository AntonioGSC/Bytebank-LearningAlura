package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente conta = new ContaCorrente(123, 123);
		
		conta.deposita(200.00);
		try {
			conta.saca(210.00);
		}catch(Exception ex) {
			System.out.println("Falha ao sacar: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}
