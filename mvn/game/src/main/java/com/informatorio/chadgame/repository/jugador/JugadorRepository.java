package com.informatorio.chadgame.repository.jugador;

import com.informatorio.chadgame.dominio.Jugador;
import com.informatorio.chadgame.dominio.Mision;

import java.util.List;

public interface JugadorRepository {
    Jugador guardar(List<Mision> misiones);
    Jugador obtenerJugador();
}
