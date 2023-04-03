package org.arle.hilos.sincronizacion;

import static org.arle.hilos.sincronizacion.EjemploSincronizacion.imprimirFrases;

public class ImprimirFrases implements Runnable{
    private String frase1;
    private String frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        try {
            imprimirFrases(this.frase1, this.frase2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
