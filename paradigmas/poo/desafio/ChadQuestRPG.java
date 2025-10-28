package paradigmas.poo.desafio;

import paradigmas.poo.desafio.dominio.Jugador;
import paradigmas.poo.desafio.dominio.Mision;
import paradigmas.poo.desafio.service.juegorpg.JuegoRPGService;
import paradigmas.poo.desafio.service.juegorpg.impl.JuegoRPGServiceImpl;
import paradigmas.poo.desafio.service.juegorpg.lector.LectorMisionesService;
import paradigmas.poo.desafio.service.juegorpg.lector.impl.LectorMisionesServiceImpl;
import paradigmas.poo.desafio.utils.ImpresoraUtils;


import java.util.List;

public class ChadQuestRPG {
    public static void main(String[] args) {
        JuegoRPGService juegoRPGService = new JuegoRPGServiceImpl();
        LectorMisionesService lectorMisionesService = new LectorMisionesServiceImpl();

        System.out.println("Bienvenido a ChadQuest RPG - Carga los puntajes de tus misiones");
        List<Mision> misiones = lectorMisionesService.leerMisiones(5);

        Jugador jugador = new Jugador(misiones);

        String mensajeTieneFallos = juegoRPGService.tieneFallos(jugador);
        String mensajeContancia = juegoRPGService.mensajeDeConstancia(jugador);
        String mensajeEvaluacion = juegoRPGService.evaluar(jugador);

        ImpresoraUtils.imprimirEvaluacion(List.of(mensajeEvaluacion,mensajeContancia,mensajeTieneFallos));

    }
}
