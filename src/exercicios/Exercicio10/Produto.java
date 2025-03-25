package exercicios.Exercicio10;

import java.io.FileWriter;
import java.io.IOException;

public class Produto {
    protected String produto;
    protected int quantidade;
    protected double precoUnitario;

    public Produto(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void salvarProduto(String nomeArquivo) {
        try {
            FileWriter writer = new FileWriter(nomeArquivo, true);
            writer.write("\n");
            writer.write("Produto: " + this.produto + " | ");
            writer.write("Quantidade: " + this.quantidade + " | ");
            writer.write("Preço: R$ " + this.precoUnitario);
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo.");
            throw new RuntimeException(e);
        }
    }
}
