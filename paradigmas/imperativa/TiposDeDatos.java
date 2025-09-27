package paradigmas.imperativa;

public class TiposDeDatos {
    public static void main(String[] args) {
        // Enteros
        /*
         * MIN_VALUE = -128
         * MAX_VALUE = 127
         */
        byte valueByte = 127;

        /*
         * MIN_VALUE = -32768
         * MAX_VALUE = 32767
         */
        short valueShort = 333;

        /*
         * MIN_VALUE = -2.147.483.648
         * MAX_VALUE = 2.147.483.647
         */
        int valueInt = 134;

        /*
         * MIN_VALUE = -2.147.483.648 muucho mas
         * MAX_VALUE = 2.147.483.647
         */
        long valueLong = 200;

        System.out.println("El valor para byte es:" + valueByte);
        System.out.println("El valor para short es:" + valueShort);
        System.out.println("El valor para int es:" + valueInt);
        System.out.println("El valor para long es:" + valueLong);


        // Reales

        float valueFloat = 2.5f;

        double valueDouble = 2.5; //Este es el valor por defecto que usa java para 

        System.out.println("El valor para float es:" + valueFloat);
        System.out.println("El valor para double es:" + valueDouble);

        // Booleano
        boolean valorTrue, valorFalse;
        valorTrue = true; valorFalse = false;

        System.out.println("El valor para variable veerdadera es:" + valorTrue);
        System.out.println("El valor para variable falsa es:" + valorFalse);

        //Char
        char valueChar = 'a';
    }
}