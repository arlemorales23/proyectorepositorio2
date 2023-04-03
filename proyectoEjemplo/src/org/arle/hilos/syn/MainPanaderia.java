package org.arle.hilos.syn;

public class MainPanaderia {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread((new Cliente(p))).start();
    }
}
