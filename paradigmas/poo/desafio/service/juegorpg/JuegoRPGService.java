package paradigmas.poo.desafio.service.juegorpg;

import paradigmas.poo.desafio.dominio.Jugador;

public interface JuegoRPGService {
    String evaluar(Jugador jugador);
    String mensajeDeConstancia(Jugador jugador);
    String tieneFallos(Jugador jugador);

}
