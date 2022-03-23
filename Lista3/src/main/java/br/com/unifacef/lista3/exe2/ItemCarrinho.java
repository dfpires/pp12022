/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unifacef.lista3.exe2;

/**
 *
 * @author professor
 */
public class ItemCarrinho {
    private String descricao;
    private int qtde, codigo;
    private float valor;

    public ItemCarrinho() {
    }

    public ItemCarrinho(String descricao, int qtde, int codigo, float valor) {
        this.descricao = descricao;
        this.qtde = qtde;
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
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

    @Override
    public String toString() {
        return "ItemCarrinho{" + "descricao=" + descricao + ", qtde=" + qtde + 
                ", codigo=" + codigo + ", valor=" + valor + '}';
    }
    
    
}
