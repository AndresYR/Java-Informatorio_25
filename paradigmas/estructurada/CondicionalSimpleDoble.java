package paradigmas.estructurada;

public class CondicionalSimpleDoble {

    public static void main(String[] args) {
        /*
        * Simple
            If ( condición ) 
            { // Sentencias} 
        */

        boolean esUnDiaLluvioso = false;

        if(esUnDiaLluvioso){
            System.out.println("Si! si esta lloviendo");
        }
        System.out.println("No! no esta lloviendo");
        
        //Forma alternativa - solo con una sola sentencia
        if(esUnDiaLluvioso) System.out.println("Si! si esta lloviendo");
        
        /*
         * If ( condicion ) 
            {//Sentencias} 
            else {//Sentencias}
        */
        esUnDiaLluvioso = true;
        if (!esUnDiaLluvioso) {
            //Entro si es verdadero
            System.out.println("Si! si esta lloviendo - Condicional doble");

        }else{
            //Entro si es falso
            System.out.println("No! no esta lloviendo - Condicional doble");
        }




    }
    





}