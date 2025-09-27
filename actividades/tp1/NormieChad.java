package actividades.tp1;

public class NormieChad {
    public static void main(String[] args) {
        // 1 - Suma de dos numeros
        
        // int num1 = 6;
        // int num2 = 7;

        // int suma = num1 + num2;

        // String paridad = (suma % 2 == 0)? "par" : "impar";

        // System.out.printf("El resultado es %d y es %s.",suma,paridad);


        // 6 - Triangulo de asteriscos
        // int lineas = 10;
        // for (int i=0; i < lineas;i++) {
        //     String sAsteriscos = "*".repeat(2*i+1);
        //     String sPadding = " ".repeat(lineas-i);

        //     System.out.println(sPadding+sAsteriscos+sPadding);
        // }

        // 11 - Acumulador
        int num1 = 3;
        int num2 = 4;

        double suma = 0;

        for (int i=1;i<=15;i++) {
            suma += (double)num1*num2/i;
        }

        System.out.println(suma);


    }
}

