package com.informatorio.chadgame.service.juegorpg;


import com.informatorio.chadgame.dominio.Jugador;

public interface JuegoRPGService {
    String evaluar(Jugador jugador);
    String mensajeDeConstancia(Jugador jugador);
    String tieneFallos(Jugador jugador);

}
