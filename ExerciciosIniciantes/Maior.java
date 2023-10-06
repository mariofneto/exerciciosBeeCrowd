package ExerciciosIniciantes;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int formulaMaiorInicial = (a+b+Math.abs(a-b))/2;
        int formulaMaiorFinal = (formulaMaiorInicial+c+Math.abs(formulaMaiorInicial-c))/2;
        System.out.println(formulaMaiorFinal + " eh o maior");
    }
}
