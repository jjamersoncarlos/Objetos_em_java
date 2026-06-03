package Exercicio15;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();

            System.out.print("Digite a quantidade do produto: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            Produto produto = new Produto(nome, preco, quantidade);
            produtos.add(produto);

            System.out.print("Deseja cadastrar outro produto? (s/n): ");
            continuar = scanner.nextLine();
        }

        System.out.println("\n=== PRODUTOS CADASTRADOS ===");
        for (Produto p : produtos) {
            p.mostrarDados();
        }

        scanner.close();
    }

}
