/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.modelo;

/**
 *
 * @author Laize Melo
 */
public class GuardadorDeContas {
    
    private Object[] referencia;
    private int posicaoLivre;
   
    
    
    public GuardadorDeContas(){
        this.referencia = new Conta[5];
    }
    
    public void adciona(Conta ref){
        this.referencia[posicaoLivre] = ref;
        this.posicaoLivre++;
    }
    
    public int getQuantidadeDeElementos(){
        return this.posicaoLivre;
    }
    
    public Conta getReferenciaContas(int posicao){
        
        return (Conta) this.referencia[posicao];
        
    }
    
   
    
}
