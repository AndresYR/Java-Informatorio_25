package paradigmas.estructurada;

public class ManejadoPorContador {
    public static void main(String[] args) {
        /*
         * Manejado por contador - For
            for ( indice declarado;condición;inc/dec de índice )
            { // Sentencias}

            Ejecuta el ciclo N veces
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("Soy el numero " + i);
        }


        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > 0; j--) {
                for (int k = 0; k < 20; k = k + 2) {
                    System.out.println("Valor i: " + i + " Valor j: " + j + " Valor k: " + k );
                }
                System.out.println("Iteracion cuando termina k");
                System.out.println("\n");
            }
        }

    }
}