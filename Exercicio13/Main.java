package Exercicio13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();

            System.out.println("Aluno " + (i + 1));

            System.out.print("Nome: ");
            alunos[i].nome = scanner.nextLine();

            System.out.print("Nota 1: ");
            alunos[i].nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            alunos[i].nota2 = scanner.nextDouble();

            scanner.nextLine();
            System.out.println();

        }

        System.out.println("\nDADOS DOS ALUNOS");
        for (int i = 0; i < alunos.length; i++) {
            alunos[i].mostrarDados();
        }

        scanner.close();

    }

}
