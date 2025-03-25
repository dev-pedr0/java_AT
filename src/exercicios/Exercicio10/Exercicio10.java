package exercicios.Exercicio10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo = "compras.txt";

        System.out.println("Cadastre 3 produtos:");

        for (int i = 1; i < 4; i++) {
            System.out.println("");
            String produto = "";
            int quantidade = 0;
            double precoUnitario = 0;

            boolean produtoValido = false;
            while(!produtoValido) {
                System.out.println("Digite o nome do produto: ");
                if (i > 1) scanner.nextLine();
                produto = scanner.nextLine();

                if(produto.isEmpty()) {
                    System.out.println("Nome vazio!");
                    System.out.println("Tente novamente!\n");
                } else if(!produto.matches("[a-zA-ZÀ-ÿ]+")) {
                    System.out.println("O nome deve conter apenas letras!\n");
                }
                else {
                    produtoValido = true;
                }
            }

            boolean quantidadeValida = false;
            while(!quantidadeValida) {
                System.out.println("Digite a quantidade do produto: ");
                try {
                    quantidade = scanner.nextInt();
                    if(quantidade <= 0) {
                        System.out.println("Quantidade zerada ou negativa!");
                        System.out.println("Tente novamente!\n");
                    }
                    else {
                        quantidadeValida = true;
                    }
                } catch(Exception e) {
                    System.out.println("Quantidade inválida!");
                    System.out.println("Tente novamente!\n");
                    scanner.nextLine();
                }
            }

            boolean precoValido = false;
            while(!precoValido) {
                System.out.println("Digite o preço unitário do produto: ");
                try {
                    precoUnitario = scanner.nextDouble();
                    precoValido = true;
                } catch(Exception e) {
                    System.out.println("Preço inválido!");
                    System.out.println("Tente novamente!\n");
                    scanner.nextLine();
                }
            }

            Produto produtoItem = new Produto(produto, quantidade, precoUnitario);
            produtoItem.salvarProduto(nomeArquivo);
        }

        try {
            List<String> linhas = Files.readAllLines(Paths.get(nomeArquivo));
            for (String linha : linhas) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo!");
            throw new RuntimeException(e);
        }
    }
}
