/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.unifacef.lista3.exe3;

/**
 *
 * @author professor
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Post p1 = new Post(1, "Fulano", "Vamos ajudar no Trote");
        
        Comment c1 = new Comment(101, "Beltrano", "Voar doar sangue");
        Comment c2 = new Comment(102, "Ciclano", "Voar doar alimentos");
        Comment c3 = new Comment(103, "João", "Voar doar suplemento");
        p1.addComment(c1);
        p1.addComment(c2);
        p1.addComment(c3);
        System.out.println(p1.toString());
        p1.removeComment(c2);
        System.out.println(p1.toString());
    }
    
}
