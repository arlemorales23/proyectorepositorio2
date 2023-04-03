package Gym;

import java.util.Scanner;

public class PrincipalGym {
    public static void main(String[] args) {
        Gym gym = new Gym(); // instancia
        Scanner x = new Scanner(System.in);

        gym.valorDia15 = 18000;
        gym.valorDia30 = 36000;
        gym.valorDia90 = 86000;
        System.out.println("menu \n  Escoja su plan : \n " +
                "1. 15 dias \n 2. 30 dias \n 3. 90 dias =>  ");
        gym.dias = x.nextInt();
        System.out.println(" el plan  " +gym.dias + "es de " + gym.costoMensualidad());
    }
}
