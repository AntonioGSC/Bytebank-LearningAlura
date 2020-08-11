package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] idades = new int[5];
//        String[] nomes = new String[5];
        
        int idade = 29;//Integer
        Integer idadeRef = Integer.valueOf("10"); 
        System.out.println(idadeRef.doubleValue());
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        
//      Integer idadeRef = new Integer(29); //autoboxing
        int valor = idadeRef.intValue();//unboxing
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);
        
        String s = args[0];
//        Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);
        
//        int valor = idadeRef.intValue();
	}

}
