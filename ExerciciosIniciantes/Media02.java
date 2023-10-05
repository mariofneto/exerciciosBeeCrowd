package ExerciciosIniciantes;

import java.util.Scanner;

public class Media02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoNota1 = 2;
        double pesoNota2 = 3;
        double pesoNota3 = 5;
        double nota1 = sc.nextDouble() * pesoNota1;
        double nota2 = sc.nextDouble() * pesoNota2;
        double nota3 = sc.nextDouble() * pesoNota3;
        double media = (nota1 + nota2 + nota3)/(pesoNota1 + pesoNota2 + pesoNota3);
        System.out.printf("MEDIA = %.1f",media);
        System.out.println();

    }
}
