import java.util.Scanner;

public class Mainaluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        Aluno aluno = new Aluno();
        aluno.nome = nome;
        aluno.nota1 = nota1;
        aluno.nota2 = nota2;

        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("\nNome: " + aluno.nome);
        System.out.println("Situação: " + aluno.verificarSituacao());

        scanner.close();

    }

}
