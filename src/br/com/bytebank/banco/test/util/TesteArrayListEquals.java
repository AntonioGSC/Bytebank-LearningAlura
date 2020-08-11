package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaPoupanca(213, 2412);
		lista.add(cc);
		
		Conta cc2 = new ContaPoupanca(213, 532);
		lista.add(cc2);
		
		Conta cc3 = new ContaPoupanca(213, 532);
		boolean exist = lista.contains(cc3);
		System.out.println(exist);
		
		for(Conta o : lista) {
			System.out.println(o);
		}
	}

}
