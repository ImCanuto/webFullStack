package com.company;

public class Main {

    public static void main(String[] args) {
	// algoritmo para ir para a praia
        boolean fimDeSemana = true;
        boolean fazSol = false;
        boolean vamosAPraia = fimDeSemana && fazSol;

        System.out.println(vamosAPraia);

        String mensagem1 = fimDeSemana ? "É fim de semana!" : "Não é fim de semana!";
        String mensagem2 = fazSol ? "Faz sol!" : "Não faz sol!";
        String mensagem3 = vamosAPraia ? "Vamos a praia!" : "Não vamos a praia :(";

        System.out.println(mensagem1);
        System.out.println(mensagem2);
        System.out.println(mensagem3);
        
    }
}
