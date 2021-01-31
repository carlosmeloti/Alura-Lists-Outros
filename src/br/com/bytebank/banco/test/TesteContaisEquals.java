/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import java.util.ArrayList;

/**
 *
 * @author Laize Melo
 */
public class TesteContaisEquals {
    
    public static void main(String[] args) {
      
        ArrayList<Conta> list = new ArrayList<Conta>();
        
        Conta c1 = new ContaCorrente(3434, 124124);
        Conta c2 = new ContaCorrente(15, 52);
        Conta c3 = new ContaCorrente(14, 54);
               
        list.add(c1);
        list.add(c2);
        
        list.remove(c1);
              
        System.out.println(list.get(0));
        
    }
    
}
