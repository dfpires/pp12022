package br.com.unifacef.exe2;

import javax.swing.JOptionPane;

public class Cliente {
    int nroConta, nroAgencia;
    String nome;
    float saldo;
    
    Cliente(){
        
    }
    Cliente(int nroConta, int nroAgencia, String nome, float saldo){
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    void sacar(float x){
        this.saldo -= x;
    }
    void depositar(float x){
        this.saldo += x;
    }
    void mostrar(){
        JOptionPane.showMessageDialog(null, "Nro conta " + this.nroConta +
                " Nro agência " + this.nroAgencia + " Nome " + this.nome +
                " Saldo " + this.saldo);
    }
    
}
