package Gym;

import java.util.Scanner;

public class PrincipalGym2 {
    public static void main(String[] args) {
        Gym2 g2 = new Gym2();
        Scanner x = new Scanner(System.in);

        g2.setValorDia15(18000);
        g2.setValorDia30(36000);
       g2.setValorDia90(86000);
        System.out.println("menu \n  Escoja su plan : \n " +
                "1. 15 dias \n 2. 30 dias \n 3. 90 dias =>  ");
        g2.setDias( x.nextInt());
        System.out.println(" el plan  " + g2.getDias() + "es de " + g2.costoMensualidad());
    }
}
