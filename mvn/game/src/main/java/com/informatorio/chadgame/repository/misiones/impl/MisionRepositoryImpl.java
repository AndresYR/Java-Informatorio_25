package com.informatorio.chadgame.repository.misiones.impl;

import com.informatorio.chadgame.dominio.Mision;
import com.informatorio.chadgame.repository.misiones.MisionRepository;

import java.util.ArrayList;
import java.util.List;

public class MisionRepositoryImpl implements MisionRepository {

    private List<Mision> misiones = new ArrayList<>();

    @Override
    public Mision guardar(Mision mision) {
        misiones.add(mision);
        return mision;
    }

    @Override
    public Mision guardar(int numero, int puntaje) {
        Mision mision = new Mision(numero,puntaje);
        return this.guardar(mision);
    }

    @Override
    public List<Mision> obtenerMisiones() {
        return this.getMisiones();
    }

    public List<Mision> getMisiones() {
        return misiones;
    }

    public void setMisiones(List<Mision> misiones) {
        this.misiones = misiones;
    }
}
