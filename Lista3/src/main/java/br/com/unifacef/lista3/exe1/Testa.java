/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.unifacef.lista3.exe1;

import java.util.Date;

/**
 *
 * @author professor
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Passageiro p = new Passageiro();
        Voo v = new Voo();
        Reserva re = new Reserva(1234, new Date(), p, v);
        
        System.out.println(re.toString());
    }
    
}
