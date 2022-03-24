package br.com.unifacef.lista3.exe2;
import java.util.Date;
public class Testa {

    public static void main(String[] args) {
        Carrinho car1 = new Carrinho(1, new Date());
        car1.setCep("14.401-295");
        ItemCarrinho ic1 = new ItemCarrinho("SSD 240", 1, 100, 200);
        ItemCarrinho ic2 = new ItemCarrinho("Monitor 21", 2, 101, 800);
        car1.addItemCarrinho(ic1);
        car1.addItemCarrinho(ic2);
        
        System.out.println(car1.toString());
        car1.removeItemCarrinho(ic1);
        System.out.println(car1.toString());
    }
    
}
