public class Aluno {

    String nome;
    double nota1;
    double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarSituacao() {
        double media = calcularMedia();

        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
