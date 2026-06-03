package Exercicio09_10;

import java.util.Scanner;

public class Mainaluno3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // exercicio 9 e 10

        System.out.print("Quantos alunos serão cadastrados? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        String nomeMaiorMedia = "";
        String nomeMenorMedia = "";
        double maiorMedia = 0;
        double menorMedia = 0;

        for (int i = 1; i <= quantidade; i++) {
            Aluno3 aluno = new Aluno3();

            System.out.println("\nAluno " + i);

            System.out.print("Nome: ");
            aluno.nome = scanner.nextLine();

            System.out.print("Nota 1: ");
            aluno.nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            aluno.nota2 = scanner.nextDouble();
            scanner.nextLine();

            double media = aluno.calcularMedia();

            if (i == 1) {
                maiorMedia = media;
                menorMedia = media;

                nomeMaiorMedia = aluno.nome;
                nomeMenorMedia = aluno.nome;
            }

            if (i == 1 || media > maiorMedia) {
                maiorMedia = media;
                nomeMaiorMedia = aluno.nome;
            }

            if (media < menorMedia) {
                menorMedia = media;
                nomeMenorMedia = aluno.nome;
            }
        }

        System.out.println("\n===== RESULTADO =====");

        System.out.println("\nAluno com maior média:");
        System.out.println("Nome: " + nomeMaiorMedia);
        System.out.printf("Média: %.2f%n", maiorMedia);

        System.out.println("\nAluno com menor média:");
        System.out.println("Nome: " + nomeMenorMedia);
        System.out.printf("Média: %.2f%n", menorMedia);

        scanner.close();
    }

}
