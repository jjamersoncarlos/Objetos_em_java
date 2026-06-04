package Exercicio19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println("\nDados do produto:");
        produto.mostrarDados();

        scanner.close();

    }

}
