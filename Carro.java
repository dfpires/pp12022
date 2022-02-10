 class Carro {
     String marca, modelo;
     boolean motor;
     float velocidade;

     public void ligar(){
         motor = true;
     }
     public void desligar(){
         motor = false;
     }
     public void acelerar(float x){
         velocidade = velocidade + x;
    }
    public void frear(float x){
        velocidade = velocidade - x;
    }
}