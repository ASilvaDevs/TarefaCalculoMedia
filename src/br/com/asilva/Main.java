package br.com.asilva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Calculadora de médias com 4 números ***");
        System.out.print("Digite o valor do primeiro número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite o valor do segundo número: ");
        double segundoNumero = scanner.nextDouble();
        System.out.print("Digite o valor do terceiro número: ");
        double terceiroNumero = scanner.nextDouble();
        System.out.print("Digite o valor do quarto número: ");
        double quartoNumero = scanner.nextDouble();

        CalculoMedia calculo = new CalculoMedia(primeiroNumero, segundoNumero, terceiroNumero, quartoNumero);

        System.out.println("O resultado da média dos valores é " + calculo.calcularMedia());

   }
}