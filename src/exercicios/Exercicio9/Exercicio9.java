package exercicios.Exercicio9;

public class Exercicio9 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Pedro", 20000.00);

        conta.depositar(2500.59);

        conta.exibirSaldo();

        conta.sacar(3475.62);
        
        conta.exibirSaldo();

        conta.sacar(30000);

        conta.exibirSaldo();
    }
}
