package com.company;

public class Main {

    public static void main(String[] args) {

        int notaAluno = 7;
        int media = 6;

        if (notaAluno >= media){
            System.out.println("Auno aprovado!");
        }
        else
            System.out.println("Aluno reprovado!");
        // Para mais situações, utilizar else if

        // OU...

        String resultado;

        if (notaAluno >= media){
            resultado = "Aprovado";
        }
        else
            resultado = "Reprovado";

        switch (resultado){     // Para mais casos com o mesmo resultado
            case "Aprovado":    // Exemplo
            case "Tananana":    // Exemplo
            case "Tatatata":
                System.out.println("Aluno aprovado!");
                break;  // Interrompe a execução do código
            case "Reprovado":
            case "Lalalala":
                System.out.println("Aluno reprovado!");
                break;
            default:
                System.out.println("Deu ruim!");    // Caso não tenha nenhum correspondente

        }



    }




}
