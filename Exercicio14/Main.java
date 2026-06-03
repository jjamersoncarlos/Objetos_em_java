package Exercicio14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();

            System.out.println("Cadastro do aluno " + (i + 1));

            System.out.print("Nome: ");
            alunos[i].nome = scanner.nextLine();

            System.out.print("Nota 1: ");
            alunos[i].nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            alunos[i].nota2 = scanner.nextDouble();

            scanner.nextLine();
            System.out.println();
        }

        System.out.print("Digite o nome do aluno para busca: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].nome.equalsIgnoreCase(nomeBusca)) {
                System.out.println("\nAluno encontrado:");
                alunos[i].mostrarDados();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Aluno nao encontrado");
        }

        scanner.close();
    }

}
