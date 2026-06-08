package Exercicio27;

public class Aluno {

    String nome;
    double nota1;
    double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Erro: a nota 1 deve estar entre 0 e 10.");
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Erro: a nota 2 deve estar entre 0 e 10.");
        }
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

}
