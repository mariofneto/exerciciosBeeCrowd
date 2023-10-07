package ExerciciosIniciantes;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int velocidadeEmKmCarro1 = 60;
        int velocidadeEmKmCarro2 = 90;

        int distancia = sc.nextInt();
        System.out.println(distancia * 2 + " minutos");

    }
}
