package org.arle.hilos.runnable;

public class EjemplointerfaceRunnnable {
    public static void main(String[] args) {
        new Thread(new ViajeTarea("Isla de pascua")).start();
        new Thread(new ViajeTarea("Argentina")).start();
        new Thread(new ViajeTarea("Colombia")).start();
    }
}
