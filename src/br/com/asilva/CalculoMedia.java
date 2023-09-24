package br.com.asilva;

public class CalculoMedia {
    private double primeiroNumero;
    private double segundoNumero;
    private double terceiroNumero;
    private double quartoNumero;

    public CalculoMedia(double primeiroNumero, double segundoNumero, double terceiroNumero, double quartoNumero){
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
        this.terceiroNumero = terceiroNumero;
        this.quartoNumero = quartoNumero;
    }

    public double calcularMedia(){
        return (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero)/ 4;
    }


}
