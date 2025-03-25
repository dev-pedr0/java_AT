package exercicios.Exercicio9;

public class ContaBancaria {
    protected String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Deposíto Inválido");
        } else {
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque Inválido");
        } else if (valor > saldo) {
            System.out.println("Saldo Insuficiente");
        } else {
            System.out.println("Saque R$ " + valor + " realizado com sucesso!");
            saldo -= valor;
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo: R$ " + saldo);
    }
}
