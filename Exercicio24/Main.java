package Exercicio24;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Jamerson");

        Aluno aluno2 = new Aluno("Camila", 6.5, 8.0);

        aluno1.alterarNotas(6.0, 9.5);

        aluno1.mostrarDados();
        aluno2.mostrarDados();
    }

}
