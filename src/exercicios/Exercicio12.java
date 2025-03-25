package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> mensagens = new ArrayList<>();

        boolean nomeValido = false;
        String nome1 = "";
        while (!nomeValido) {
            System.out.println("Digite o seu nome: ");
            nome1 = scanner.nextLine();

            if (nome1.trim().isEmpty()) {
                System.out.println("Nome vazio!");
                System.out.println("Tente novamente!\n");
            } else if (!nome1.matches("[a-zA-ZÀ-ÿ]+")) {
                System.out.println("Nome só pode conter letras!");
                System.out.println("Tente novamente!\n");
            } else {
                nomeValido = true;
            }
        }

        nomeValido = false;
        String nome2 = "";
        while (!nomeValido) {
            System.out.println("Digite o seu nome: ");
            nome2 = scanner.nextLine();

            if (nome2.trim().isEmpty()) {
                System.out.println("Nome vazio!");
                System.out.println("Tente novamente!\n");
            } else if (!nome2.matches("[a-zA-ZÀ-ÿ]+")) {
                System.out.println("Nome só pode conter letras!");
                System.out.println("Tente novamente!\n");
            } else {
                nomeValido = true;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(nome1 + ", digite sua mensagem: ");
            mensagens.add(nome1 + ": " + scanner.nextLine());
            System.out.print(nome2 + ", digite sua mensagem: ");
            mensagens.add(nome2 + ": " + scanner.nextLine());
        }

        System.out.println("===== Histórico de Mensagens =====");
        for (String mensagem : mensagens) {
            System.out.println(mensagem);
        }

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês!");
    }
}
