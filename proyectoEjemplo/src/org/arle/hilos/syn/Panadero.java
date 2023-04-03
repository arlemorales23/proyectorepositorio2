package org.arle.hilos.syn;

import java.util.concurrent.ThreadLocalRandom;

public class Panadero implements Runnable{
    private Panaderia panaderia;

    public Panadero(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            panaderia.hosnerar("pan no " + i);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    }