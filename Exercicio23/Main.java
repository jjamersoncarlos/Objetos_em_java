package Exercicio23;

public class Main {

    
    public static void main(String[] args) {

        
        Produto produto1 = new Produto("Teclado", 15.50);

       
        Produto produto2 = new Produto("Mouse", 2.50, 100);

       
        System.out.println("Produto 1:");
        produto1.exibirDados();

        System.out.println("Produto 2:");
        produto2.exibirDados();
    }
}
