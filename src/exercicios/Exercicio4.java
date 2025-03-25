package exercicios;

import java.util.Scanner;

public class Exercicio4 {
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

        boolean emprestimoioValido = false;
        double emprestimo = 0;
        while (!emprestimoioValido) {
            System.out.println("Digite o valor do empréstimo: ");
            try {
                emprestimo = scanner.nextDouble();
                if (emprestimo <= 0) {
                    System.out.println("Salário negativo!");
                    System.out.println("Tente novamente!\n");
                } else {
                    emprestimoioValido = true;
                }
            } catch (Exception e) {
                System.out.println("Salário invalido!");
                System.out.println("Tente novamente!\n");
                scanner.nextLine();
            }
        }

        boolean parcelasValidas = false;
        int parcelas = 0;
        while (!parcelasValidas) {
            System.out.println("Digite em quantas parcelas deseja pagar: ");
            try {
                parcelas = scanner.nextInt();
                if (parcelas <= 0) {
                    System.out.println("Parcelas negativas!");
                    System.out.println("Tente novamente!\n");
                } else if (parcelas < 6) {
                    System.out.println("A quantidade mínima de parcelas é 6");
                    System.out.println("Tente novamente!\n");
                } else if (parcelas > 48) {
                    System.out.println("A quantidade máxima de parcelas é 48");
                    System.out.println("Tente novamente!\n");
                } else {
                    parcelasValidas = true;
                }
            } catch (Exception e) {
                System.out.println("Valor de parcela invalido!");
                System.out.println("Tente novamente!\n");
                scanner.nextLine();
            }
        }

        double primeiraParcela = emprestimo / parcelas;
        double parcelasTotal = 0;
        for (int i = 1; i <= parcelas; i++) {
            parcelasTotal += primeiraParcela * 1.03;
        }
        double novaParcela = parcelasTotal / parcelas;

        System.out.println("\nSeu dados são:");
        System.out.println("Nome: " + nome);
        System.out.println("Seu empréstimo é de: " + emprestimo);
        System.out.println("Serão " + parcelas + " parcela(s)");
        System.out.println("O valor final a ser pago é de: " + parcelasTotal);
        System.out.println("As parcelas será de: " + novaParcela);
    }
}
