package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] vetor = new int[6]; // Declaração do tamanho do vetor
        int i, j = 1;

        for (i=0 ; i<vetor.length ; i++){   // vetor.length dá o tamanho do vetor automaticamente
            vetor[i] = j;
            j++;
            System.out.println(vetor[i]);
        }

        // OU

        System.out.println(Arrays.toString(vetor));  // Outra forma (mais simples) de exibir os valores do vetor

        int maior = vetor[0];
        int menor = vetor[0];
        int media = 0;

        for (i=0 ; i< vetor.length ; i++){
            if (maior < vetor[i]){
                maior = vetor[i];
            }
            if (menor > vetor[i]){
                menor = vetor[i];
            }
            media += vetor[i];
        }
        System.out.printf("Maior: %d\nMenor: %d\nMedia: %.2f\n", maior, menor, (float)media/ vetor.length);

    }
}
