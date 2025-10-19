package paradigmas.estructurada.desafio.dominio;

public class Examen {
    private int numero;
    private int nota;

    public Examen(int nota, int numero) {
        this.nota = nota;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int getNota() {
        return nota;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public boolean estaAprobado() {
        return this.nota >= 60;
    }
}
