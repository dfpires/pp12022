public class TestaCarro {
    
    public static void main(String args[]){
        Carro obj1 = new Carro();
        obj1.marca = "Chvrolet";
        obj1.modelo = "Onix";
        obj1.motor = false;
        obj1.velocidade = 0;

        obj1.ligar();
        obj1.acelerar(40);

        System.out.println("Motor: " + obj1.motor + " Velocidade " + obj1.velocidade);
    }
}
