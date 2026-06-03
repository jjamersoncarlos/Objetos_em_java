package Exercicio11;

import java.util.Scanner;

public class Mainaluno4 {

    public static void main(String[] args) {

        // Exercicio 11

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serão cadastrados? ");
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine();

        double somaMedias = 0;

        for (int i = 1; i <= quantidadeAlunos; i++) {
            Aluno4 aluno = new Aluno4();

            System.out.println("\nAluno " + i);

            System.out.print("Nome: ");
            aluno.nome = scanner.nextLine();

            System.out.print("Nota 1: ");
            aluno.nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            aluno.nota2 = scanner.nextDouble();
            scanner.nextLine();

            double media = aluno.calcularMedia();
            somaMedias += media;

            System.out.printf("Média de %s: %.2f%n", aluno.nome, media);
        }

        double mediaGeral = somaMedias / quantidadeAlunos;

        System.out.printf("%nMédia geral da turma: %.2f%n", mediaGeral);

        scanner.close();

    }

}
