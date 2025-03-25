package exercicios.Exercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Loteria {
    public List<Integer> sorteio = new ArrayList<>();

    public Loteria() {
        Random random = new Random();
        while (sorteio.size() < 6) {
            int numero = random.nextInt(60) + 1;
            sorteio.add(numero);
        }
    }
}
