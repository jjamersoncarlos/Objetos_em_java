package Exercicio20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serão cadastrados? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("\nAluno " + i);

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();
            scanner.nextLine();

            Aluno aluno = new Aluno(nome, nota1, nota2);

            aluno.mostrarDados();
        }

        scanner.close();
    }

}