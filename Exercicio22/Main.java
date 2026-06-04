package Exercicio22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados do carro
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite a velocidade máxima do carro: ");
        int velocidadeMaxima = scanner.nextInt();

        Carro carro = new Carro(modelo, velocidadeMaxima);

        int opcao = 0;

        // Menu
        while (opcao != 4) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Mostrar velocidade");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro.acelerar();
                    break;

                case 2:
                    carro.frear();
                    break;

                case 3:
                    carro.mostrarVelocidade();
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

}
