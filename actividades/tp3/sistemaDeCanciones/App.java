package actividades.tp3.sistemaDeCanciones;

public class App {
    public static void main(String[] args) {
        Cancion cancion = new Cancion("Sin documentos", "Andres Calamaro", "3:40");

        System.out.println(cancion.getTitulo());
    }
}
