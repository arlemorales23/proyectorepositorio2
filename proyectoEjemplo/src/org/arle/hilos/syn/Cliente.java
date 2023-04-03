package org.arle.hilos.syn;

import java.util.concurrent.ThreadLocalRandom;

public class Cliente implements Runnable{
    private Panaderia panaderia;

    public Cliente(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10 ; i++) {
            panaderia.consumir();
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
