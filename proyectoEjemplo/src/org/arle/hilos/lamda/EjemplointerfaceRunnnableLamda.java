package org.arle.hilos.lamda;

import org.arle.hilos.runnable.ViajeTarea;

public class EjemplointerfaceRunnnableLamda {
    public static void main(String[] args) throws InterruptedException {
        Runnable viaje = () -> {
                for (int i = 0; i <10; i++) {
                    System.out.println(i + "----" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("finalmnete me voy de viaje a  " + Thread.currentThread().getName());
        };
        /* new Thread(viaje, "Isla de pascua").start();
        new Thread(viaje, "San Andres").start();
        new Thread(viaje, "Rosario").start();
        System.out.println("continuando con el metodo main...");*/
         Thread v1 = new Thread(viaje, "Isla de pascua");
        Thread v2 = new Thread(viaje, "san Andres");
        Thread v3 = new Thread(viaje, "Rosario");

        v1.start();
        v2.start();
        v3.start();
        v1.join();
        v2.join();
        v3.join();

        System.out.println("continuando con el metodo main...");
    }
}
