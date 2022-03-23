package br.com.unifacef.exe4;

import javax.swing.JOptionPane;

public class Rio {
     String nome;
     float nivel;
     boolean poluido; // false não está poluido, true está poluido
    
    Rio(){
        
    }
    Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    void sujar(){
        this.poluido = true;
    }
    void limpar(){
        this.poluido = false;
    }
    void chover(float x){
        this.nivel += x;
    }
    void ensolarar(float x){
        this.nivel -=x;
    }
     void mostra(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome + 
        " Nível " + this.nivel + " Poluído: " + 
                (this.poluido ? "sim": "não"));
    }
}
