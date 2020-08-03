package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(200, 12, 123);
		
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(23, 123);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		System.out.println(cc1);
		System.out.println(referencias[0]);
//		System.out.println(referencias[1].getNumero());
		
		ContaCorrente ref = (ContaCorrente) referencias[0]; //type cast
		System.out.println(ref);
	}

}
