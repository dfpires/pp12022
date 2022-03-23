/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unifacef.lista3.exe1;

import java.util.Date;

/**
 *
 * @author professor
 */
public class Reserva {
    private int codigo;
    private Date data;
    private Passageiro passageiro;
    private Voo voo;

    public Reserva() {
    }

    public Reserva(int codigo, Date data, Passageiro passageiro, Voo voo) {
        this.codigo = codigo;
        this.data = data;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    @Override
    public String toString() {
        return "Reserva{" + "codigo=" + codigo + 
                ", data=" + data + 
                ", passageiro=" + passageiro.toString() + 
                ", voo=" + voo.toString() + '}';
    }
    
    
}
