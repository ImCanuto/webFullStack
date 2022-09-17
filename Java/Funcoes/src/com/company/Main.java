package com.company;

public class Main {

    public static void main(String[] args) {
        String nome = "Samuel";
        int resultado = soma(2, 3);

        saudacao(nome);
        System.out.println(resultado);
    }

    public static void saudacao(String name) {  // Declaração da função
        System.out.println("Olá, " + name + "!");
    }

    public static int soma(int a, int b){
        return a+b;
    }
}
