package paradigmas.poo.desafio.dominio;

public class Mision {
    private int numero;
    private int puntaje;

    public Mision(int puntaje, int numero) {
        this.puntaje = puntaje;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public boolean esFallida() {
        return this.getPuntaje() ==0;
    }
}
