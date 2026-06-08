package Exercicio29;

public class Professor extends Pessoa {
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void mostrarDados() {
        System.out.println("\n=== Dados do Professor ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Disciplina: " + getDisciplina());

    }

}