package actividades.tp1;

import java.util.HashMap;
import java.util.Map;

public class SoftChad {
    public static void main(String[] args) {
        //4 - Promedio de edad
        // Map<String, Integer> nombreEdadDic = new HashMap<>();
        // nombreEdadDic.put("Andres",34);
        // nombreEdadDic.put("Jose",28);
        // nombreEdadDic.put("Maria",23);
        // int sumaEdad = 0;
        // int iter = 0;

        // for (Map.Entry<String, Integer> entrada : nombreEdadDic.entrySet()) {
        //     String nombre = entrada.getKey();
        //     Integer edad = entrada.getValue();

        //     sumaEdad += edad;
        //     iter++;

        //     System.out.printf("Nombre: %s - Edad: %d%n", nombre, edad);
        // }
        // int promedioEdad = (iter != 0)? sumaEdad/iter : 0;
        // System.out.printf("La edad promedio es de %d años", promedioEdad);

        //5 - Conversión a kilogramos
        final double KILOS_A_LIBRAS = 2.20462;

        double pesoLibras = 5.3;
        double pesoKilos = pesoLibras / KILOS_A_LIBRAS;
        
        System.out.printf("%.2f libras equivalen a %.2f kilos.", pesoLibras, pesoKilos);
    }
}
