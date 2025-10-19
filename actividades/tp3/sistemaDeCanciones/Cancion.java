package actividades.tp3.sistemaDeCanciones;

public class Cancion {
    private String titulo;
    private String artista;
    private String duracion;

    //Constructor
    public Cancion(String titulo, String artista,String duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    //Getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getArtista() {
        return this.artista;
    }

    public String getDuracion() {
        return this.duracion;
    }
}

