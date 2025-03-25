package com.d4nk.contenido.Arreglos;

import java.util.Scanner;

public class ArreglosParesImpares {
    public static void main(String[] args) {

        int[]  a, pares, impares;
        int totalPares = 0, totalImpares = 0;

        a = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 10 números: ");
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++){
            if (a[i]%2 == 0){
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int auxPares = 0, auxImpares = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i]%2 == 0){
                pares[auxPares++] = a[i];
            } else {
                impares[auxImpares++] = a[i];
            }
        }

        System.out.println("###  PARES ###");
        for (int i : pares){
            System.out.print(i + " | ");
        }

        System.out.println("\n### IMPARES ###");
        for (int i : impares){
            System.out.print(i + " | ");
        }
    }



}
