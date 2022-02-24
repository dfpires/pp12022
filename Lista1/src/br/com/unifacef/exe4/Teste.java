
package br.com.unifacef.exe4;

public class Teste {

    public static void main(String[] args) {
        
        Rio obj1 = new Rio("Amazonas", 0.5f, false);
        obj1.mostra();
        
        obj1.sujar();
        obj1.chover(1);
        
        obj1.mostra();
        
        obj1.limpar();
        obj1.ensolarar(0.2f);
        
        obj1.mostra();
        
        Rio obj2 = new Rio();
        
        obj2.nivel = -0.9f;
    }
    
}
