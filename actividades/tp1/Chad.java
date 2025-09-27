package actividades.tp1;

import java.util.Scanner;

public class Chad {
    public static void main(String[] args) {
        //1 - Obtener porcentaje
        // double numReal = 63.47;
        // int numEntero = 14;

        // double porcentaje = 100*numEntero/numReal;

        // System.out.printf("%.2f%%",porcentaje);

        //2- Conversión de dolares a pesos
        // final double COTIZACION_USD = 1384.50;

        // Scanner input = new Scanner(System.in);

        // System.out.println("Ingrese el monto en USD que desea convertir a ARS");
        // double montoUSD = input.nextDouble();

        // double montoARS = montoUSD * COTIZACION_USD;

        // System.out.printf("%.2f USD equivalen a %.2f ARS", montoUSD, montoARS);

        // input.close();

        //2 - Conversion de grados Celsius a Fahrenhei
        // Scanner input = new Scanner(System.in);

        // System.out.println("Ingrese los grados Celsius");
        // double gradosC = input.nextDouble();

        // double gradosF = (gradosC*9/5) + 32;

        // System.out.printf("%.2f ºC equivalen a %.2f ªF", gradosC, gradosF);

        // input.close();

        // 4 - Calculo de la media aritmetica
        double acum = 0;
        int cant = 0;
        boolean flag = true;
        
        Scanner input = new Scanner(System.in);

        while (flag) {

            System.out.println("Ingrese el número o 0 para terminar");
            double num = input.nextDouble();

            if (num == 0) {
                flag = false;
            } else {
                acum += num;
                cant++;
            }

        }

        input.close();

        double promedio = acum/cant;

        System.out.printf("El promedio de los valores ingresados es: %.2f", promedio);
        

    }
}
