package br.com.unifacef.exe1;

import javax.swing.JOptionPane;

public class Aluno {
    int nroAluno, idade;
    String nome;
    float p1, p2;
    
    // método construtor sem parâmetro
    Aluno(){
        
    }
    // método construtor com parâmetros
    Aluno(int nroAluno, int idade, String nome,float p1, float p2){
        this.nroAluno = nroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    
    void dadosAluno(){
        JOptionPane.showMessageDialog(null, "Nro. " + this.nroAluno + 
                " Nome: " + this.nome + " Idade: " + this.idade);
    }
    
    String passou(){
        return (this.notaFinal() > 6) ? "Aprovado" : "Reprovado";
    }
}
