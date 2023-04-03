package Suma;

import java.util.Scanner;

public class SumaMain {
    public static void main(String[] args) {
        Scanner x = new  Scanner(System.in);
        System.out.println("ingrese el numero 1: ");
        int n1 = x.nextInt();
        System.out.println("ingrese el numero 2: ");
        int n2 = x.nextInt();
        Suma suma = new Suma(n1, n2);
        System.out.println(" la suma es " + suma.Sumar());
    }
}
