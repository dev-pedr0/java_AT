package exercicios.Execicio6;

public class Exercicio6 {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("SGD364FGD", "Civic", 1998, 345.65);
        Veiculo veiculo2 = new Veiculo("HJU567BVF", "Space Fox", 2001, 512.45);

        veiculo1.registrarViagem(100.00);
        veiculo2.registrarViagem(150.00);
        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}
