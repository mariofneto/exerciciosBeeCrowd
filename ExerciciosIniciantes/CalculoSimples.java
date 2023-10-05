package ExerciciosIniciantes;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigoRoupa1 = sc.nextInt();
        int quantidadeDeRoupas1 = sc.nextInt();
        double valorUnitarioRoupas1 = sc.nextDouble();

        int codigoRoupa2 = sc.nextInt();
        int quantidadeDeRoupas2 = sc.nextInt();
        double valorUnitarioRoupas2 = sc.nextDouble();

        double somaValorFinalRoupa1 = quantidadeDeRoupas1 * valorUnitarioRoupas1;
        double somaValorFinalRoupa2 = quantidadeDeRoupas2 * valorUnitarioRoupas2;
        double somaValorFinalRoupas = somaValorFinalRoupa1 + somaValorFinalRoupa2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", somaValorFinalRoupas);
        System.out.println();
    }
}
