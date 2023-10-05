package ExerciciosIniciantes;

import java.util.Scanner;

public class Media01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoNota1 = 3.5;
        double pesoNota2 = 7.5;
        double nota1 = sc.nextDouble() * pesoNota1;
        double nota2 = sc.nextDouble() * pesoNota2;
        double media = (nota1 + nota2)/(pesoNota1+pesoNota2);
        System.out.printf("MEDIA = %.5f", media);
        System.out.println();
    }
}
