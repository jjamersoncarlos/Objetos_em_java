public class Produto {

    String nome;
    double preço;
    int quantidade;

    void mostrarDados() {

        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: R$ " + preço);
        System.out.println("Quantidade: " + quantidade);
    }

    double calcularValortotal() {
        return preço * quantidade;

    }

}
