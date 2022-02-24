package br.com.unifacef.exe0;

import javax.swing.JOptionPane;

public class Carro {
    // declaração das vriáveis
    String modelo;
    int ano;
    float velocidade;
    boolean motor; // true (ligado) ou false (desligado)
    
    // método construtor
    Carro(){
        
    }
    Carro(String modelo, int ano, float velocidade, boolean motor){
        // this representa o objeto que chama o método
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.motor = motor;
    }
    // métodos
    void ligar(){
        this.motor = true;
    }
    void desligar(){
        this.motor = false;
        this.velocidade = 0;
    }
    void acelerar(float x){
        this.velocidade += x;
    }
    void frear(float x){
        this.velocidade -=x;
    }
    void mostrar(){
        JOptionPane.showMessageDialog(null, "Modelo: " + this.modelo + 
        " Ano: " + this.ano + " Vel " + this.velocidade +
        " Motor: " + this.motor);
    }
}
