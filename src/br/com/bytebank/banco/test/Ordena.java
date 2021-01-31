/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import java.util.Comparator;

/**
 *
 * @author Laize Melo
 */
public class Ordena implements Comparator<Conta> {

    @Override
    public int compare(Conta t, Conta t1) {
            if(t.getAgencia() > t1.getAgencia()){
                return 1;
            }
            if(t.getAgencia() < t1.getAgencia()){
                return -1;
            }
            
            return 0;       
        }

    
}
