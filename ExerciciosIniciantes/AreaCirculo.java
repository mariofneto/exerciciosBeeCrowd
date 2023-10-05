package ExerciciosIniciantes;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio = sc.nextDouble();
        double areaCirculo = pi * (raio*raio);
        System.out.printf("A=%.4f", areaCirculo);
        System.out.println();
    }
}
