package br.com.unifacef.exe0;

import javax.swing.JOptionPane;

public class Testa {
    public static void main(String[] args) {
        // cria o objeto da classe Carro
        String auxModelo = JOptionPane.showInputDialog("Informe modelo");
        int auxAno = Integer.parseInt(JOptionPane.showInputDialog("Informe ano"));
        float auxVel = Float.parseFloat(JOptionPane.showInputDialog("Informe vel"));
        int opcao = JOptionPane.showConfirmDialog(null, "Carro está ligado?");
        boolean auxMotor;
        auxMotor = (opcao == JOptionPane.OK_OPTION);
        
        Carro obj1 = new Carro(auxModelo, auxAno, auxVel, auxMotor); // this representa obj1
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
        
        // criar o objeto 2
        auxModelo = JOptionPane.showInputDialog("Informe modelo");
        Carro obj2 = new Carro(auxModelo, 2012, 0, false); // this representa obj2
        
        obj2.mostrar();
        obj2.ligar();
        obj2.mostrar();
        obj2.acelerar(80);
        obj2.mostrar();
        obj2.frear(50);
        obj2.mostrar();
        obj2.desligar();
        obj2.mostrar();
        
        Carro obj3 = new Carro();
    }
    
}
