package exercicios.Exercicio7;

public class Aluno {
    protected String nome;
    protected String matricula;
    protected double nota1;
    protected double nota2;
    protected double nota3;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota2 = nota2;
        this.nota1 = nota1;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public void verificarAprovacao(double media) {
        if (media >= 7) {
            System.out.println("\nAluno Aprovado\n");
        } else {
            System.out.println("\nAluno Reprovado\n");
        }
    }
}
