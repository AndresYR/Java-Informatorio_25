package paradigmas.estructurada;

public class CondicionalCase {
    public static void main(String[] args) {
        /*
         * switch(value){
            case x : 
                Código para valor == x
                break;
            case y :
                Código para valor == y
            default:
                Código para valor default
        }
         */

        String curso = "Java";
        final String MENSAJE_BIENVENIDA = "Bienvenidos al curso de ";
        final String CURSO_DE_PYTHON = "Python";
        final String CURSO_DE_JAVA = "Java";
        final String CURSO_DE_TESTING = "Testing";


        switch (curso) {
            case "Python":
                System.out.println(MENSAJE_BIENVENIDA + " " + CURSO_DE_PYTHON);
                break;
            case "Java":
                System.out.println(MENSAJE_BIENVENIDA + " " + CURSO_DE_JAVA);
            case "Testing":
                System.out.println(MENSAJE_BIENVENIDA + " " + CURSO_DE_TESTING);
            default:
                System.out.println("Valor por default");
        }
        System.out.println("Continuamos por aca!!");

        
        curso = "Python";
        switch (curso) {
            case "Python","Java":
                System.out.println(MENSAJE_BIENVENIDA + " la vas a pasar bien");
                break;
            case "Testing":
                System.out.println(MENSAJE_BIENVENIDA + " " + CURSO_DE_TESTING);
                break;
            default:
                System.out.println("Valor por default");
        }
        System.out.println("Continuamos por aca!!");


        //Forma tradicional
        String este = "ESTE";
        int numeroDeLetras = 0;

        switch (este) {
            case "NORTE","OESTE":
                numeroDeLetras = 5;
                break;
            case "SUR":
                numeroDeLetras = 3;
                break;
            case "ESTE":
                numeroDeLetras = 4;
                break;
            default:
                 numeroDeLetras = 0;
        }
        System.out.println("Numero de letras : " + numeroDeLetras);

        //Forma simplificada solo si devolvemos un valor --> JAVA 17


        numeroDeLetras = switch(este){
                case "NORTE", "OESTE" -> 5;
                case "SUR" -> 3;
                case "ESTE" -> 4;
                default -> 0;
            };


    }
}