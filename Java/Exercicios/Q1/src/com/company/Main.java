package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Questão 1.
        //Escreva um programa que informa a tabuada de multiplicação de um
        //número informado pelo usuário (entre 1-10).

        Scanner ler = new Scanner(System.in);  // Scan da entrada do usuário
        int numero;

        System.out.println("Entre com um número de 1 a 10: ");
        numero = ler.nextInt();
        tabuada(numero);
    }

    public static void tabuada (int n) {
        int i;

        System.out.printf("A tabuada do %d é: \n", n);

        for (i=1 ; i<=10 ; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
    }
}
