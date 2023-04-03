package org.arle.hilos;

import org.arle.hilos.thread.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("Jhon");
        hilo.start();
       // Thread.sleep(100);
        Thread hilo2 = new NombreThread("maria");
        hilo2.start();
        Thread hilo3 = new NombreThread("pepe");
        hilo3.start();
        System.out.println(hilo.getState());
    }

}
