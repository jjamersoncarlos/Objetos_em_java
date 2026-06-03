package Exercicio12;

import java.util.Scanner;

public class Mainproduto2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Exercicio 12

        System.out.print("Quantos produtos serão cadastrados? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Produto2[] produtos = new Produto2[n];

        String nomeMaisCaro = "";
        double maiorPreco = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nProduto " + (i + 1));

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Preço: ");
            double preco = scanner.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            produtos[i] = new Produto2(nome, preco, quantidade);

            if (i == 0 || preco > maiorPreco) {
                maiorPreco = preco;
                nomeMaisCaro = nome;
            }
        }

        System.out.println("\nProduto mais caro cadastrado:");
        System.out.println("Nome: " + nomeMaisCaro);
        System.out.println("Preço: R$ " + maiorPreco);

        scanner.close();

    }
}
