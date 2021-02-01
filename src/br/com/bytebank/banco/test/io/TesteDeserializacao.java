/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.ContaCorrente;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Laize Melo
 */
public class TesteDeserializacao {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bi"));
        ContaCorrente cc = (ContaCorrente) ois.readObject();
        System.out.println(cc.getSaldo());
        System.out.println(cc.getTitular().getNome());
   }
    
}
