package Exercicio26;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.print("Digite o nome do produto: ");
        produto.setNome(scanner.nextLine());

        System.out.print("Digite o preço do produto: ");
        produto.setPreco(scanner.nextDouble());

        System.out.print("Digite a quantidade do produto: ");
        produto.setQuantidade(scanner.nextInt());

        System.out.println("\n--- Dados do Produto ---");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());

        scanner.close();
    }

}
