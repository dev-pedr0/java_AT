package exercicios.Exercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Loteria loteria = new Loteria();

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            boolean numeroValido = false;
            while (!numeroValido) {
                System.out.println("Digite um numero de 1 a 60: ");
                int numero = scanner.nextInt();
                if (numero >= 1 && numero <= 60) {
                    numeros.add(numero);
                    numeroValido = true;
                }
                else {
                    System.out.println("Número inválido!");
                }
            }
        }

        List<Integer> acertos = new ArrayList<>(numeros);
        acertos.retainAll(loteria.sorteio);

        System.out.println("Numeros corretos: " + acertos);
        System.out.println("Quantidade de acertos: " + acertos.size());
        System.out.println("Números sorteados: " + loteria.sorteio);
    }
}
