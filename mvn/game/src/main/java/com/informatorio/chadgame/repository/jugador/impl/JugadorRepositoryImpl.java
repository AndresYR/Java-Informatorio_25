package com.informatorio.chadgame.repository.jugador.impl;

import com.informatorio.chadgame.dominio.Jugador;
import com.informatorio.chadgame.dominio.Mision;
import com.informatorio.chadgame.repository.jugador.JugadorRepository;

import java.util.List;

public class JugadorRepositoryImpl implements JugadorRepository {

    private  Jugador jugador;

    @Override
    public Jugador guardar(List<Mision> misiones) {
        this.setJugador(new Jugador(misiones));
        return this.getJugador();
    }

    @Override
    public Jugador obtenerJugador() {
        return this.getJugador();
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}
