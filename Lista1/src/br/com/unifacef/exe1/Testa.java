package br.com.unifacef.exe1;

import javax.swing.JOptionPane;

public class Testa {

    public static void main(String[] args) {
        int auxNroAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe nro"));
        int auxIdade = Integer.parseInt(JOptionPane.showInputDialog("Informe idade"));
        String auxNome = JOptionPane.showInputDialog("Informe nome");
        float auxP1 = Float.parseFloat(JOptionPane.showInputDialog("Informe p1"));
        float auxP2 = Float.parseFloat(JOptionPane.showInputDialog("Informe p2"));;
        
        Aluno obj1 = new Aluno(auxNroAluno, auxIdade, auxNome, auxP1, auxP2);
        
        JOptionPane.showMessageDialog(null, obj1.passou());
        
        obj1.dadosAluno();
        
        JOptionPane.showMessageDialog(null, " Média: " + obj1.notaFinal());
        
        Aluno obj2 = new Aluno();
        obj2.idade = 20;
    }
    
}
