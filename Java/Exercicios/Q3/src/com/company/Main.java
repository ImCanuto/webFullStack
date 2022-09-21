package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
	// Questão 3.
        //Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final
        //da entrada dos 5 itens, exiba a lista completa.

        Scanner ler = new Scanner(System.in);
        String[] lista = new String[5];
        int i;

        System.out.println("Insira a sua lista de compras (5 frutas): ");
        for (i=0 ; i< lista.length ; i++){
            lista[i] = ler.next();
        }
        imprime_lista(lista);
    }

    public static void imprime_lista(String[] lista){

        System.out.println("As frutas no seu carrinho são: ");
        System.out.println(Arrays.toString(lista));

    }
}
