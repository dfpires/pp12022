package br.com.unifacef.exe0;
public class Testa {
    public static void main(String[] args) {
        System.out.println("Hello World !!!");
        // cria o objeto da classe Carro
        Carro obj1 = new Carro();
        obj1.modelo = "Onix";
        obj1.ano = 2019;
        obj1.velocidade = 0;
        obj1.motor = false;
        // chamar os métodos
        obj1.mostrar();
        
        obj1.ligar();
        obj1.mostrar();
        
        obj1.acelerar(50);
        obj1.mostrar();
        
        obj1.frear(20);
        obj1.mostrar();
        
        obj1.desligar();
        obj1.mostrar();
    }
    
}
