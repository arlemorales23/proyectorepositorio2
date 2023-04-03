package org.arle.hilos.sincronizacion;

public class EjemploSincronizacion {
    public static void main(String[] args) {
        new Thread(new ImprimirFrases("hola ", "que tal!")).start();
        new Thread(new ImprimirFrases("quien eres? ", "tu? ")).start();
        new Thread(new ImprimirFrases("muchas gracias ", "amigo")).start();
    }
    public synchronized static void imprimirFrases(String frase1, String frase2) throws InterruptedException {
        System.out.print(frase1);
    Thread.sleep(500);
        System.out.println(frase2);
    }
}
