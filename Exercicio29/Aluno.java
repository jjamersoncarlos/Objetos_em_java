package Exercicio29;

public class Aluno extends Pessoa {
    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void mostrarDados() {
        System.out.println("=== Dados do Aluno ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Nota: " + getNota());
    }

}
