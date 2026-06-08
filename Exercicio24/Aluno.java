package Exercicio24;

public class Aluno {

    String nome;
    double nota1;
    double nota2;

    Aluno(String nome) {
        this.nome = nome;
        this.nota1 = 0;
        this.nota2 = 0;
    }

    Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    void alterarNotas(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void mostrarDados() {

        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + calcularMedia());
        System.out.println();
    }

}
