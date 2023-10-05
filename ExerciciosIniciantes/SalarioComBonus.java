package ExerciciosIniciantes;

import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeVendedor = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double valorTotalVendas = sc.nextDouble();
        double comissao = valorTotalVendas * 0.15;
        double salarioComComissao = salarioFixo+comissao;
        System.out.printf("TOTAL = R$ %.2f", salarioComComissao);
        System.out.println();
    }
}
