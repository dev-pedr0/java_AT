package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean nomeValido = false;
        String nome = "";
        while (!nomeValido) {
            System.out.println("Digite o seu nome: ");
            nome = scanner.nextLine();

            if (nome.trim().isEmpty()) {
                System.out.println("Nome vazio!");
                System.out.println("Tente novamente!\n");
            } else if (!nome.matches("[a-zA-ZÀ-ÿ]+")) {
                System.out.println("Nome só pode conter letras!");
                System.out.println("Tente novamente!\n");
            } else {
                nomeValido = true;
            }
        }

        boolean salarioValido = false;
        double salario = 0;
        while (!salarioValido) {
            System.out.println("Digite o seu salário mensal: ");
            try {
                salario = scanner.nextDouble();
                if (salario <= 0) {
                    System.out.println("Salário negativo!");
                    System.out.println("Tente novamente!\n");
                } else {
                    salarioValido = true;
                }
            } catch (Exception e) {
                System.out.println("Salário invalido!");
                System.out.println("Tente novamente!\n");
                scanner.nextLine();
            }
        }

        double salarioAnual = Math.round(salario * 12 * 100.0) / 100.0;
        double imposto;
        if (salarioAnual <= 22847.76) {
            imposto = 0;
        } else if (salarioAnual <= 33919.80 && salarioAnual >= 22847.77) {
            imposto = 0.075;
        } else if (salarioAnual <= 45012.60 && salarioAnual >= 33919.81) {
            imposto = 0.15;
        } else {
            imposto = 0.275;
        }

        double salarioAnualLiquido = Math.round(((salarioAnual * (1 - imposto)) * 100.0) / 100.0);
        double salarioMensalLiquido = Math.round((salarioAnualLiquido / 12) * 100.0) / 100.0;

        System.out.println("\nSeu dados são:");
        System.out.println("Nome: " + nome);
        System.out.println("Salário bruto mensal: " + salario);
        System.out.println("Salário bruto anual: " + salarioAnual);
        System.out.println("Imposto: " + (imposto*100) +"%");
        System.out.println("Salário líquido mensal: " + salarioMensalLiquido);
        System.out.println("Salário líquido anual: " + salarioAnualLiquido);
    }
}
