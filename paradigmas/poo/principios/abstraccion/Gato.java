package paradigmas.poo.principios.abstraccion;

public class Gato extends Animal{
    public Gato(String nombre, int cantidadDePatas, boolean esDomestico) {
        super(nombre, cantidadDePatas, esDomestico);
    }

    @Override
    public void emitirSonido() {
        System.out.println("miau miau miau");
    }
}
