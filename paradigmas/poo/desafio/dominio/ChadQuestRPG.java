package paradigmas.poo.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class ChadQuestRPG {
    public static void main(String[] args) {
        System.out.println("Bienvenido a ChadQuest RPG - Carga los puntajes de tus misiones");
        List<Mision> misiones = new ArrayList<Mision>();

        misiones.add(new Mision(100,1));
        misiones.add(new Mision(200,2));
        misiones.add(new Mision(300,3));
        misiones.add(new Mision(400,4));
        misiones.add(new Mision(500,5));

        Jugador jugador = new Jugador(misiones);
        JuegoRPG juego = new JuegoRPG(jugador);
        juego.evaluar();

    }
}
