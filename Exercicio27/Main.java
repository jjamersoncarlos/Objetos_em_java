package Exercicio27;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(entrada.nextLine());

        System.out.print("Digite a primeira nota: ");
        aluno.setNota1(entrada.nextDouble());

        System.out.print("Digite a segunda nota: ");
        aluno.setNota2(entrada.nextDouble());

        System.out.println("\n--- Dados do Aluno ---");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.printf("Média: %.2f%n", aluno.calcularMedia());
        System.out.println("Situação: " + aluno.verificarSituacao());

        entrada.close();
    }

}
