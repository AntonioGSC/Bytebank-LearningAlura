package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generics
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		ContaCorrente cc = new ContaCorrente(213, 2412, 125512);
		lista.add(cc);
		
		ContaCorrente cc2 = new ContaCorrente(213, 532, 213);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		ContaCorrente ref = (ContaCorrente) lista.get(0);
		
		System.out.println(ref.getValorImposto());
		
//		lista.remove(0);
		
		System.out.println(lista.size());
		
//  	ref = (Conta) lista.get(0);
		
		System.out.println(ref.getNumero());
		
		for(Conta o : lista) {
			System.out.println(o);
		}
	}

}
