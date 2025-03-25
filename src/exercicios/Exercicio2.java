package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean nomeValido = false;
        String nome = "";
        while(!nomeValido) {
            System.out.println("Digite o seu nome: ");
            nome = scanner.nextLine();

            if(nome.trim().isEmpty()) {
                System.out.println("Nome vazio!");
                System.out.println("Tente novamente!\n");
            } else if (!nome.matches("[a-zA-ZÀ-ÿ]+")) {
                System.out.println("Nome só pode conter letras!");
                System.out.println("Tente novamente!\n");
            } else {
                nomeValido = true;
            }
        }

        boolean senhaValida = false;
        String senha;
        while(!senhaValida){
            System.out.println("Digite sua senha: ");
            senha = scanner.nextLine();

            boolean temMaiuscula = senha.matches(".*[A-Z].*");
            boolean temNumero = senha.matches(".*[0-9].*");
            boolean temCaracteres = senha.matches(".*[^a-zA-Z0-9].*");
            boolean temOito = senha.length() >= 8;

            if (temMaiuscula && temNumero && temCaracteres && temOito){
                System.out.println("\nSeu nome é: " + nome);
                System.out.println("A senha " + senha + " é válida.");
                senhaValida = true;
            }
            else {
                System.out.println("\nSenha inválida. A senha precisa de:");
                if (!temMaiuscula){
                    System.out.println("Ao menos uma letra maiúscula.");
                }
                if (!temNumero){
                    System.out.println("Ao menos um número.");
                }
                if (!temCaracteres){
                    System.out.println("Ao menos um caractere especial.");
                }
                if (!temOito){
                    System.out.println("Ao menos oito caracteres.");
                }
                System.out.println("Tente novamente!\n");
            }
        }
    }
}
