package br.com.bytebank.banco.test.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDeserializacao {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(cc.getSaldo());
		System.out.println(cc.getTitular());
	}
}
