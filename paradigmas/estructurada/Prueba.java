package paradigmas.estructurada;

public class Prueba {
    public static void main(String[] args) {
        String formato = "%-20s%-40s%-20s%-20s";
        String header = formato.formatted("Tipo", "Nombre", "Duración", "Exito");
        System.out.println(header);
    }
}
