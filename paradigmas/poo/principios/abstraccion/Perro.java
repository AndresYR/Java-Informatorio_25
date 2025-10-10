package paradigmas.poo.principios.abstraccion;

public class Perro extends Animal implements IComportamientoPerro{
    public Perro(String nombre, int cantidadDePatas, boolean esDomestico) {
        super(nombre, cantidadDePatas, esDomestico);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Ladrar waf waf");
    }

    @Override
    public void dormir() {
        System.out.println("Dormir perro");
    }

    @Override
    public void moverLaCola() {
        System.out.println("Moviendo la cola");
    }

    @Override
    public void traerPalito() {
        System.out.println("Moviendo la cola");
    }
}
