package paradigmas.estructurada;

public class CondicionalMultiple {
    public static void main(String[] args) {
        
        boolean esUnDiaLluvioso = false;
        final String DIA = "Sabado";

        /*
         * Múltiple
            If ( condición ) 
            {//Sentencias} 
            else if ( condición )
            {//Sentencias}
            else if ( condición )
            { //Sentencias }
            else  ←(opcional)
            { //Sentencias }
         */

        if(esUnDiaLluvioso && DIA == "MARTES"){
            System.out.println("Hoy es : " + DIA + "Y esta lloviendo");
        }else if(esUnDiaLluvioso == false){
            System.out.println("Hoy es :" + DIA +" Y no esta lloviendo ");
        }else{
            System.out.println("Este es el mensaje por default");
        }

        if (esUnDiaLluvioso) {
            System.out.println("Es un dia de lluvia!!!");

            if (DIA == "Lunes" || DIA == "MARTES") {
                System.out.println("Hoy es : " + DIA + " Te espera un dia lluvioso");
            }else if(DIA == "Miercoles"){
                System.out.println("Mejorara el clima, saldra el sol");
            }else if(DIA == "Jueves"){
                System.out.println("Dia humedo y caluroso");
            }else if(DIA == "Viernes"){
                System.out.println("Dia super caluroso");
            }else{
                System.out.println("No se cumple ninguna de las alternativas anteriores");
            }
            //Muchos mas codigo!!
        }else{
            System.out.println("No es un dia lluvioso");
        }



    }
}