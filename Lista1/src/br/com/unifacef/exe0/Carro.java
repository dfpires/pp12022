package br.com.unifacef.exe0;
public class Carro {
    // declaração das vriáveis
    String modelo;
    int ano;
    float velocidade;
    boolean motor; // true (ligado) ou false (desligado)
    
    // métodos
    void ligar(){
        motor = true;
    }
    void desligar(){
        motor = false;
        velocidade = 0;
    }
    void acelerar(float x){
        velocidade += x;
    }
    void frear(float x){
        velocidade -=x;
    }
    void mostrar(){
        System.out.println("Modelo: " + modelo + 
        " Ano: " + ano + " Vel " + velocidade +
        " Motor: " + motor);
    }
}
