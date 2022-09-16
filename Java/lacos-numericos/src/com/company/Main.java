package com.company;

public class Main {

    public static void main(String[] args) {
	// 1 2 3 4 5 6 7 8 9 10 - Que nem em C, não tem segredo
        int i;
        int j;

        for (i=1 ; i<=10 ; i++){
            System.out.println(i);
        }

        for (i=1 ; i<=10 ; i++){
            for (j=1 ; j<=10 ; j++){
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
        }
    }
}
