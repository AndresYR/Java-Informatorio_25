package paradigmas.poo.principios;

import paradigmas.poo.principios.abstraccion.Animal;
import paradigmas.poo.principios.abstraccion.Gato;
import paradigmas.poo.principios.abstraccion.IComportamientoPerro;
import paradigmas.poo.principios.abstraccion.Perro;
import paradigmas.poo.principios.herencia.Celular;
import paradigmas.poo.principios.herencia.Paloma;
import paradigmas.poo.principios.herencia.Telegrafo;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //Herencia

        Celular celular = new Celular("Mama", false);
        Telegrafo telegrafo = new Telegrafo("Mi abuelo");
        Paloma paloma = new Paloma("Mi hermana");

        celular.enviarMensaje("Hola mama");
        telegrafo.enviarMensaje("Hola abu");
        paloma.enviarMensaje("Junta la ropa");


        //Abstraccion
        Gato gato = new Gato("Tesla",4,true);
        Perro perro = new Perro("Adolf",4,true);

        perro.moverLaCola();

        List<Animal> animals = new ArrayList<>();
        animals.add(gato);
        animals.add(perro);

        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).emitirSonido();
        }

        IComportamientoPerro interfazImplementada = new Perro("nombre",4,true);
        interfazImplementada.moverLaCola();
        interfazImplementada.traerPalito();
    }
}
