package exercicios.Exercicio8;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void mostrarDados() {
        System.out.println("\nDados:");
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salarioBase + "\n");
    }
}