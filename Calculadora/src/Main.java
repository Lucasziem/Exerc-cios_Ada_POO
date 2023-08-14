public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(7, 5);

        System.out.println("O resultado da soma é: " + String.format("%.2f", calculadora.somar()));
        System.out.println("O resultado da subtração é: " + String.format("%.2f", calculadora.diminuir()));
        System.out.println("O resultado da multiplicação é: " + String.format("%.2f", calculadora.multiplicar()));
        System.out.println("O resultado da divisão é: " + String.format("%.2f", calculadora.dividir()));

    }

}