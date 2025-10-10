package paradigmas.poo.principios.abstraccion;

// Las clases abstractas no se instancian
public abstract class Animal {
    protected String nombre;
    protected int cantidadDePatas;
    protected boolean esDomestico;

    public Animal(String nombre, int cantidadDePatas, boolean esDomestico) {}

    public abstract void emitirSonido(); //Metodos que no se implementan, debe implementarse en los hijos

    public void dormir() {
        System.out.println("Animal durmiendo "+ nombre);
    }

}