package Exercicio25;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Jamerson");


        ContaBancaria conta2 = new ContaBancaria("Camila", 1000.0);

        conta1.depositar(0.0);
        conta1.sacar(0.0);

     
        conta2.depositar(200);
        conta2.sacar(300);

       
        System.out.println("Conta 1:");
        conta1.mostrarSaldo();

        System.out.println("\nConta 2:");
        conta2.mostrarSaldo();
    }
    
}
