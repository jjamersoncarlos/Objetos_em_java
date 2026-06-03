package Exercicio07_08;

import java.util.Scanner;

public class Mainaluno2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aprovados = 0;
        int reprovados = 0;

        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= quantidade; i++) {
            Aluno2 aluno = new Aluno2();

            System.out.println("\nCadastro do aluno " + i);

            System.out.print("Nome: ");
            aluno.nome = scanner.nextLine();

            System.out.print("Nota 1: ");
            aluno.nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            aluno.nota2 = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Média de " + aluno.nome + ": " + aluno.calcularMedia());
            System.out.println("Situação: " + aluno.verificarSituacao());

            if (aluno.calcularMedia() >= 7) {
                aprovados = aprovados + 1;
            } else {
                reprovados = reprovados + 1;
            }
        }

        System.out.println("\n===== RESULTADO FINAL =====");
        System.out.println("Quantidade de aprovados: " + aprovados);
        System.out.println("Quantidade de reprovados: " + reprovados);

        scanner.close();
    }
}
