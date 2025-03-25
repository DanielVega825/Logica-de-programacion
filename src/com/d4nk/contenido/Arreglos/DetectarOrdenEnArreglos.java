package com.d4nk.contenido.Arreglos;

import java.util.Scanner;

public class DetectarOrdenEnArreglos {
    public static void main(String[] args) {

        int [] a = new int[7];

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 7 números: ");

        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }


        boolean asc = false;
        boolean desc = false;
        for (int i = 0; i < a.length - 1; i ++){
            if (a[i] > a[i+1]){
                desc = true;
            }
            if (a[i] < a[i+1]){
                asc = true;
            }

        }

        if (asc == true && desc == true){
            System.out.println("Arreglo = desordenado");
        }

        if (asc == false && desc == false){
            System.out.println("Arreglo = todos son iguales");
        }

        if (asc == true && desc == false){
            System.out.println("Arreglo = ordenado de forma ascendente");
        }

        if (asc == false && desc == true){
            System.out.println("Arreglo = ordenado de forma descendente");
        }
    }
}
