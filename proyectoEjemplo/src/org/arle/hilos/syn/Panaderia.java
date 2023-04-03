package org.arle.hilos.syn;

public class Panaderia {
    private String pan;
    private boolean disponible;

    public synchronized void hosnerar(String masa) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.pan = masa;
        System.out.println("el panadero hornea el pan");
        this.disponible = true;
        notify();
    }

    public synchronized String consumir() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("cliente consume pan " + this.pan );
        this.disponible = false;
        notify();
        return pan;
    }
}
