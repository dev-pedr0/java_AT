package exercicios.Exercicio8;

public class Exercicio8 {
    public static void main(String[] args) {
        Estagiario estagiario = new Estagiario("Pedro", 1000.00);
        Gerente gerente = new Gerente("Lucas", 10000.00);

        estagiario.mostrarDados();
        gerente.mostrarDados();
    }
}
