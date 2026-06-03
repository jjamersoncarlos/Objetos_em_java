package Exercicio01_02;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Jamerson";
        pessoa.idade = 32;

        pessoa.apresentar();

        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "Carlos";
        pessoa2.idade = 25;

        pessoa2.apresentar();

    }

}
