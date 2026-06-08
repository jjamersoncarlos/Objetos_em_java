package Exercicio29;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Jamerson");
        aluno.setIdade(32);
        aluno.setNota(9.5);

        Professor professor = new Professor();
        professor.setNome("Bruno");
        professor.setIdade(31);
        professor.setDisciplina("Java");

        aluno.mostrarDados();
        professor.mostrarDados();
    }

}
