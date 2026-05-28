import java.util.*;

public class Mainproduto {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = leitor.nextLine();
        System.out.println("Digite o preço do produto:");
        double preço = leitor.nextDouble();
        System.out.println("Digite a quantidade do produto:");
        int quantidade = leitor.nextInt();

        Produto produto = new Produto();

        produto.nome = nome;
        produto.preço = preço;
        produto.quantidade = quantidade;

        produto.mostrarDados();

        double Valortotal = produto.calcularValortotal();
        System.out.println("Valor total em estoque: R$ " + Valortotal);

        leitor.close();

    }
}
