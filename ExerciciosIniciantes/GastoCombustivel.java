package ExerciciosIniciantes;


import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kmLitrosAutomovel = 12;
        int horasViajando = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        double quantidadeLitrosNecessaria = (double)(horasViajando * velocidadeMedia) / kmLitrosAutomovel;
        System.out.printf("%.3f",quantidadeLitrosNecessaria);
        System.out.println();

    }
}
