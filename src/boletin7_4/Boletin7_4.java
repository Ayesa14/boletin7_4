package boletin7_4;

import javax.swing.JOptionPane;

public class Boletin7_4 {

    public static void main(String[] args) {
        Peso obj = new Peso();
        
        String nome1 = JOptionPane.showInputDialog("Ingrese el nombre de la primera persona");
        String nome2 = JOptionPane.showInputDialog("Ingrese el nombre de la segunda persona");
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso de la primera persona: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso de la segunda persona: "));
        
        obj.quienPesa(nome1, nome2, n1, n2);
    }
    
}
