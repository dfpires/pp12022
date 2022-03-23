package br.com.unifacef.lista3.exe0;

import java.util.Date;

public class Cartao {
    private String numero, bandeira;
    private int cvv, senha;
    private Date validade;
    // objeto-parte
    private Conta conta;

    public Cartao() {
    }

    public Cartao(String numero, String bandeira, int cvv, int senha, 
            Date validade, Conta conta) {
        this.numero = numero;
        this.bandeira = bandeira;
        this.cvv = cvv;
        this.senha = senha;
        this.validade = validade;
        this.conta = conta;
    }

    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    public void mostra(){
        System.out.println("Número: " + this.numero + 
       " Senha: " + this.senha + " Validade: " + this.validade + 
                "Bandeira " + this.bandeira + " CVV " + this.cvv);
        this.conta.mostra();
    }
            
    // sacar
    public void sacar(float valor, int senha){
        // checar senha, a validade do cartão, o saldo da conta do cartão
        // saldo não pode ficar negativo
        // dando tudo certo, atualiza o saldo
        if (this.senha == senha){ // verifica
            // data do saque
            Date agora = new Date();
            if (agora.before(this.validade)){ // verifica a validade
                // saque
                this.conta.setSaldo(this.conta.getSaldo() - valor);
            }
            else {
                System.out.println("Cartão vencido");
            }
        }
        else {
            System.out.println("Senha inválida");
        }
        
    }
    
}
