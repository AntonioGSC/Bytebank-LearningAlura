package br.com.bytebank.banco.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;


public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Cliente cliente = new Cliente();
		cliente.setNome("Nico");
		cliente.setProfissao("DEV");
		cliente.setCpf("3123124123");
		
		ContaCorrente cc = new ContaCorrente(222, 333, 1234);
		cc.setTitular(cliente);
		cc.deposita(222.30);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cc);
		oos.close();

//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		Cliente cliente2 = (Cliente) ois.readObject();
//		ois.close();
//		System.out.println(cliente2.getNome());
	}
}
