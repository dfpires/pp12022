/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unifacef.lista3.exe1;

/**
 *
 * @author professor
 */
public class Passageiro {
    private String nome, cpf;

    public Passageiro() {
    }

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override // o toString da classe Object é anulado
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
    
    
}
