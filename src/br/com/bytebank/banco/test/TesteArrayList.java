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
public class TesteArrayList {
    
    public static void main(String[] args) {
        
        GuardadorDeContas guardador = new GuardadorDeContas();
        
        Conta c1 = new ContaCorrente(12, 56);
        Conta c2 = new ContaCorrente(15, 52);
        Conta c3 = new ContaCorrente(14, 54);
        
        ArrayList<Conta> list = new ArrayList<Conta>();
        
        list.add(c1);
        list.add(c2);
        
        for(Object ref: list){
            System.out.println(ref);
        }
        
        System.out.println("-----------");
        
        list.remove(c1);
        
        for(Conta conta: list){
            System.out.println(conta);
        }
        
        
//        guardador.adciona(c1);
//        guardador.adciona(c2);
//        guardador.adciona(c3);
//        
//        //guardador.exibe();
//        
//        int tamanho = guardador.getQuantidadeDeElementos();
//        
//        System.out.println(tamanho);
//        
//        Conta ref = guardador.getReferenciaContas(1);
//        
//        System.out.println(ref.getNumero());
//        
        
        
        
        
    }
    
}
