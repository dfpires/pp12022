package br.com.unifacef.lista3.exe0;

import java.util.Calendar;
import java.util.Date;

public class Teste {

    public static void main(String[] args) {
        
        // objeto-parte
        Conta cta1 = new Conta("12-3", "23-4", "Fulano", 2000);
        
        // criando uma data
        Calendar data = Calendar.getInstance();
        data.set(Calendar.MONTH, 2);
        data.set(Calendar.YEAR, 2023);
        data.set(Calendar.DAY_OF_MONTH, 17);
        // data.getTime() transforma objeto Calendar em Date
        Cartao cra1 = new Cartao("1234", "Visa", 999, 8888, data.getTime(), cta1);
        cra1.sacar(500, 8888);
        cra1.mostra();
        
        Cartao cra2 = new Cartao();
        cra2.setBandeira("Mastercard");
        cra2.setConta(cta1); // objeto-parte dentro do objeto-todo
        cra2.setCvv(777);
        cra2.setNumero("6543");
        cra2.setSenha(1234);
        cra2.setValidade(data.getTime());
        cra2.sacar(800, 1234);
        cra2.mostra();
        
        cra2.sacar(1400, 1234);
        cra2.mostra();
    }
    
}
