package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		ContaCorrente cc = new ContaCorrente(123, 123, 123);
		guardador.adiciona(cc);
		
		ContaCorrente cc2 = new ContaCorrente(213, 532, 213);
		guardador.adiciona(cc2);
		
		Cliente cliente = new Cliente();
		guardador.adiciona(cliente);
		
		int tamanho = guardador.getQuatidadeDeElementos();
		System.out.println(tamanho);
		
		ContaCorrente referenciacc = (ContaCorrente) guardador.getReferencia(0);
		System.out.println(referenciacc.getValorImposto());
	}

}
