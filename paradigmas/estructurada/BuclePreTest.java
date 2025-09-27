package paradigmas.estructurada;

public class BuclePreTest {
    public static void main(String[] args) {
    /*
     * Pre-test - While
        While ( condición )
        { // Sentencias}

        Ejecuta el ciclo de 0 a N veces
     */
        int condicion = 1;
        while (condicion <= 10) {
            System.out.println("Hola soy el numero " + condicion);
            //condicion = condicion + 1;
            condicion++; 
            if (condicion == 5) {
                break;
            }
        }
    }
    
}