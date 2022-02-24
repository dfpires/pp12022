
package br.com.unifacef.exe3;

public class Teste {

 
    public static void main(String[] args) {
        Produto obj1 = new Produto();
        
        Produto obj2 = new Produto(101, "Máscara", 50, 3.5f); // f converte para float
    
        obj2.mostra();
        
        obj2.comprar(5);
        obj2.aumentar(1);
        
        obj2.mostra();
        
        obj2.vender(2);
        obj2.diminuir(0.5f);
        
        obj2.mostra();
    }
    
}
