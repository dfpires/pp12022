/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unifacef.lista3.exe1;

/**
 *
 * @author professor
 */
public class Voo {
    private int numero;
    private String origem, destino;

    public Voo() {
    }

    public Voo(int numero, String origem, String destino) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    @Override
    public String toString() {
        return "Voo{" + "numero=" + numero + ", origem=" + origem + 
                ", destino=" + destino + '}';
    }
    
}
