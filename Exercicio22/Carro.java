package Exercicio22;

public class Carro {

    String modelo;
    int velocidadeAtual;
    int velocidadeMaxima;

    public Carro(String modelo, int velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public void acelerar() {
        if (velocidadeAtual + 10 <= velocidadeMaxima) {
            velocidadeAtual += 10;
        } else {
            velocidadeAtual = velocidadeMaxima;
        }

        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void frear() {
        if (velocidadeAtual - 10 >= 0) {
            velocidadeAtual -= 10;
        } else {
            velocidadeAtual = 0;
        }

        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void mostrarVelocidade() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        System.out.println("Velocidade máxima: " + velocidadeMaxima + " km/h");
    }

}
