package com.informatorio.chadgame.repository.misiones;

import com.informatorio.chadgame.dominio.Mision;

import java.util.List;

public interface MisionRepository {
    Mision guardar(Mision mision);

    Mision guardar(int numero, int puntaje);

    List<Mision> obtenerMisiones();

}
