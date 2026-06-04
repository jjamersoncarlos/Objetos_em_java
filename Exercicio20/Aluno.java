package Exercicio20;

public class Aluno {

    String nome;
    double nota1;
    double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarSituacao() {
        if (calcularMedia() >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void mostrarDados() {
        System.out.println("\nNome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.printf("Média: %.2f%n", calcularMedia());
        System.out.println("Situação: " + verificarSituacao());
    }

}
