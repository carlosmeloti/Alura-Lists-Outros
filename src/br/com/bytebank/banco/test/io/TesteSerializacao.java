/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Laize Melo
 */
public class TesteSerializacao {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Carlos");
        cliente.setCpf("813.620.642-20");
        cliente.setProfissao("Analista de Sistemas");
        
        ContaCorrente cc = new ContaCorrente(12, 555);
        cc.setTitular(cliente);
        cc.deposita(300);
        
               
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bi"));
        oos.writeObject(cc);
        oos.close();
    }
    
}
