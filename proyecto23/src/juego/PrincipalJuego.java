package juego;

import java.util.Scanner;

public class PrincipalJuego {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Scanner x = new Scanner(System.in);
        juego.carta1Uno =    (int)(Math. random()*10+1);
        juego.carta2Uno =    (int)(Math. random()*10+1);
        juego.carta3Uno =    (int)(Math. random()*10+1);
        juego.carta1Dos =    (int)(Math. random()*10+1);
        juego.carta2Dos =    (int)(Math. random()*10+1);
        juego.carta3Dos =    (int)(Math. random()*10+1);

        System.out.println("empezo el juego....");
        System.out.println("Jugador 1 \n carta 1 :"+ juego.carta1Uno + " carta 2: "+ juego.carta2Uno);
        System.out.println("Jugador 2 \n carta 1: "+ juego.carta1Dos + " carta 2: "+ juego.carta2Dos);
        System.out.println("oprima cualquier tecla para ver resultados...");

        System.out.println("Jugador 1 \n carta: 1 "+ juego.carta3Uno);
        System.out.println("Jugador 2 \n carta: 1 "+ juego.carta3Dos );
        juego.jugar();
    }
}
