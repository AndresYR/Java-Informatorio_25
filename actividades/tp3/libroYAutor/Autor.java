package actividades.tp3.libroYAutor;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Libro libro) {
        libros.add(libro);
    }
}
