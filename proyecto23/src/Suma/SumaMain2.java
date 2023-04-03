package Suma;

import javax.swing.*;

public class SumaMain2 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero 1"));
        Suma suma = new Suma(n1, n2);
        JOptionPane.showMessageDialog(null,"la suma es "+ suma.Sumar());
    }
}
