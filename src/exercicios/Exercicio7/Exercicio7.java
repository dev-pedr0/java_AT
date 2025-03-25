package exercicios.Exercicio7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeAluno = "";
        boolean nomeValido = false;
        while (!nomeValido) {
            System.out.println("Digite o nome do aluno: ");
            nomeAluno = scanner.nextLine();

            if (nomeAluno.trim().isEmpty()) {
                System.out.println("Nome vazio!");
                System.out.println("Tente novamente!\n");
            } else if (!nomeAluno.matches("[a-zA-ZÀ-ÿ]+")) {
                System.out.println("Nome só pode conter letras!");
                System.out.println("Tente novamente!\n");
            } else {
                nomeValido = true;
            }
        }

        String matriculaAluno = "";
        boolean matriculaValida = false;
        while (!matriculaValida) {
            System.out.println("Digite a matricula do aluno: ");
            matriculaAluno = scanner.nextLine();

            if (matriculaAluno.trim().isEmpty()) {
                System.out.println("Matrícula vazia!");
                System.out.println("Tente novamente!\n");
            } else if (!matriculaAluno.matches("^\\d+$")) {
                System.out.println("Matrícula só pode conter números!");
                System.out.println("Tente novamente!\n");
            } else {
                matriculaValida = true;
            }
        }

        double nota1= 0;
        double nota2= 0;
        double nota3= 0;
        boolean nota1Valida = false;
        boolean nota2Valida = false;
        boolean nota3Valida = false;
        while(!nota1Valida) {
            System.out.println("Digite a primeira nota do aluno: ");
            try {
                nota1 = scanner.nextDouble();
                if (nota1 <= 0) {
                    System.out.println("Nota negativa!");
                    System.out.println("Tente novamente!\n");
                } else {
                    nota1Valida = true;
                }
            } catch (Exception e) {
                System.out.println("Nota invalida!");
                System.out.println("Tente novamente!\n");
                scanner.nextLine();
            }
        }
        while(!nota2Valida) {
            System.out.println("Digite a segunda nota do aluno: ");
            try {
                nota2 = scanner.nextDouble();
                if (nota2 <= 0) {
                    System.out.println("Nota negativa!");
                    System.out.println("Tente novamente!\n");
                } else {
                    nota2Valida = true;
                }
            } catch (Exception e) {
                System.out.println("Nota invalida!");
                System.out.println("Tente novamente!\n");
                scanner.nextLine();
            }
        }
        while(!nota3Valida) {
            System.out.println("Digite a terceira nota do aluno: ");
            try {
                nota3 = scanner.nextDouble();
                if (nota3 <= 0) {
                    System.out.println("Nota negativa!");
                    System.out.println("Tente novamente!\n");
                } else {
                    nota3Valida = true;
                }
            } catch (Exception e) {
                System.out.println("Nota invalida!");
                System.out.println("Tente novamente!\n");
                scanner.nextLine();
            }
        }

        Aluno aluno = new Aluno(nomeAluno, matriculaAluno, nota1, nota2, nota3);
        double media = aluno.calcularMedia();

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("\nMédia: " + df.format(media));
        aluno.verificarAprovacao(media);
    }
}
