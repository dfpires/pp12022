/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unifacef.lista3.exe2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author professor
 */
public class Carrinho {
    private int codigo;
    private float valor;
    private Date data;
    private String cep;
    // objeto-parte
    private ArrayList<ItemCarrinho> itens;

    public Carrinho() {
        // aloca espaço na momória para o ArrayList
        this.itens = new ArrayList();
    }

    public Carrinho(int codigo, float valor, Date data, String cep, 
            ArrayList<ItemCarrinho> itens) {
        this.codigo = codigo;
        this.valor = valor;
        this.data = data;
        this.cep = cep;
        this.itens = itens;
    }

    public Carrinho(int codigo, Date data) {
        this.codigo = codigo;
        this.data = data;
        this.valor = 0;
        this.itens = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public ArrayList<ItemCarrinho> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemCarrinho> itens) {
        this.itens = itens;
    }
    
    // adiciona 1 ItemCarrinho em itens
    public void addItemCarrinho(ItemCarrinho item){
        this.itens.add(item);
        this.valor = this.valor + (item.getValor() * item.getQtde());
        System.out.println("Item adicionado");
    }
    
    //remove 1 ItemCarrinho em itens
    public void removeItemCarrinho(ItemCarrinho item){
        if (this.itens.remove(item)){
            this.valor = this.valor - (item.getValor() * item.getQtde());
           System.out.println("Item removido");
        }
        else {
           System.out.println("Item não existe");
        }
    }

    @Override
    public String toString() {
        return "Carrinho{" + "codigo=" + codigo + 
                ", valor=" + valor + ", data=" + data + 
                ", cep=" + cep + ", itens=" + itens + '}';
    }
    
}
