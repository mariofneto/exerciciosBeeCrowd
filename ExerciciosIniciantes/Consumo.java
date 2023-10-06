package ExerciciosIniciantes;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanciaPercorrida = sc.nextInt();
        double combustivelGasto = sc.nextDouble();
        double consumo = distanciaPercorrida / combustivelGasto;
        System.out.printf("%.3f km/l",consumo);
        System.out.println();
    }
}
