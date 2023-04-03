/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
 
        String nombre = scanner.nextLine();
        int id = Integer.parseInt(scanner.nextLine());
        double precio = Double.parseDouble(scanner.nextLine());
        char simbolo = scanner.nextLine().charAt(0);
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
    
}
