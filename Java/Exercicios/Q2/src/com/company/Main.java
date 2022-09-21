package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Questão 2.
        //Escreva um programa que converte temperaturas de Celsius para Fahrenheit. Fórmula (0 °C ×
        //9/5) + 32 = 32 °F

        Scanner ler = new Scanner(System.in);
        float temperatura;

        System.out.println("Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit: ");
        temperatura = ler.nextFloat();
        ConvertToF(temperatura);
    }

    public static void ConvertToF(float n){
        float convertido;

        convertido = (n * (9/5)) + 32;

        System.out.printf("O equivalente a %.2f C é %.2f F.", n, convertido);
    }
}
