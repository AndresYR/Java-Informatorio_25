package actividades.tp3.libroYAutor;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Julio Cortazar");
        Autor autor2 = new Autor("Edgar Alan Poe");

        Libro libro1 = new Libro("Rayuela",autor1,"Novela","asdlasldald");
        Libro libro2 = new Libro("Bestiario",autor1,"Cuentos","asdawwddwad");
        Libro libro3 = new Libro("El Pendulo",autor2,"Novela","asdlasldald");
        Libro libro4 = new Libro("Asesinato en la calle Morgue",autor2,"Policial","asdlasldald");

        System.out.println("Libro: "+libro1.getTitulo()+" - Autor: "+libro1.getAutor().getNombre());

        System.out.println("Autor: "+autor1.getNombre());
        for (Libro libro : autor1.getLibros()) {
            System.out.println(" - "+libro.getTitulo());
        }
    }
}
