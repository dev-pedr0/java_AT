package exercicios.Exercicio8;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, (salarioBase * 1.2));
    }
}
