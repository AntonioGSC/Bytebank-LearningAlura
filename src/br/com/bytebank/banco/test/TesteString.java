package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Antonio"; //object literal
//		String outro = new String("Gabriel");
		
		String nomeReplace = nome.replace("A", "a");
		String nomeReplaceChar = nome.replace('n', 'N');
		String nomeUpper = nome.toUpperCase();
		char c = nome.charAt(2);
		int i = nome.indexOf("on");
		String subNome = nome.substring(3);
		int tamanho = nome.length();
		boolean vazio = nome.trim().isEmpty();
		boolean contem = nome.contains("An");
		
		System.out.println(nome);
		System.out.println(nomeReplace);
		System.out.println(nomeReplaceChar);
		System.out.println(nomeUpper);
		System.out.println(c);
		System.out.println(i);
		System.out.println(subNome);
		System.out.println(tamanho);
		System.out.println(vazio);
		System.out.println(contem);
		
		for(int cont = 0; cont < tamanho; cont++) {
			System.out.println(nome.charAt(cont));
		}
	}

}
