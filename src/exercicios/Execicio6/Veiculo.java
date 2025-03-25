package exercicios.Execicio6;

public class Veiculo {
    protected String placa;
    protected String modelo;
    protected int anoFrabricacao;
    protected double quilometragem;

    public Veiculo(String placa, String modelo, int anoFrabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFrabricacao = anoFrabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("\nDados do veículo");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano Frabricacao: " + anoFrabricacao);
        System.out.println("Quilometragem: " + quilometragem + "\n");
    }

    public double registrarViagem(double km) {
        quilometragem += km;
        return quilometragem;
    }
}
