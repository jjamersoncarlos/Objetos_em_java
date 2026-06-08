package Exercicio28;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(titular);

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Consultar titular");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();

                    if (conta.depositar(deposito)) {
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                    break;

                case 2:
                    System.out.print("Valor para saque: R$ ");
                    double saque = scanner.nextDouble();

                    if (conta.sacar(saque)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }
                    break;

                case 3:
                    System.out.printf("Saldo atual: R$ %.2f%n", conta.getSaldo());
                    break;

                case 4:
                    System.out.println("Titular: " + conta.getTitular());
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

}
