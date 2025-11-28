package com.informatorio.chadgame.utils;

import java.util.Scanner;

public class LectorUtils {

    public static int leerEnteroPositivo(Scanner sc) {

        int valor = -1;

        while (valor < 0) {
            valor = sc.nextInt();

            if (valor < 0) {
                System.out.println("Ingrese un numero positivo");
            }
        }
        return valor;
    }
}
