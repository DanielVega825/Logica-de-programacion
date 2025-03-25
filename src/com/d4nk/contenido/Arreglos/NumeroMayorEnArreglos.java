package com.d4nk.contenido.Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class NumeroMayorEnArreglos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digita los números separados por una coma: ");
        String [] partes = sc.next().split(",");

        int[] numeros = new int[partes.length];
        for (int i = 0; i < partes.length; i++){
            numeros[i] = Integer.parseInt(partes[i]);
        }

        int mayor = 0;

        //Operador ternario para reducir código
        for (int i: numeros) {

            mayor = i;
            mayor = (mayor < i) ? i:mayor;
        }


        System.out.println("El número mayor del arreglo " + Arrays.toString(numeros) + " es: " + mayor);
    }
}
