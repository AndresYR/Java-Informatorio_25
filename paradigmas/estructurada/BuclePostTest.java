package paradigmas.estructurada;

public class BuclePostTest {
    public static void main(String[] args) {
        /*
         * Post-test - Do - While 
            Do{//Sentencias} 
            while ( condición )
                
            Ejecuta el ciclo de 1 a N veces
         */
        int condicion = 2;
        do {
            System.out.println("Adios! soy el numero " + condicion);
            condicion--;
        } while (condicion > 0);


    }
}