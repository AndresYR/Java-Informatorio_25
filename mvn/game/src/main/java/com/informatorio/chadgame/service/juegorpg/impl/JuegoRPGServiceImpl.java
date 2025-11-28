package com.informatorio.chadgame.service.juegorpg.impl;


import com.informatorio.chadgame.dominio.Jugador;
import com.informatorio.chadgame.service.juegorpg.JuegoRPGService;

public class JuegoRPGServiceImpl implements JuegoRPGService {
    @Override
    public String evaluar(Jugador jugador) {
        int total = jugador.calcularTotal();

        if (total>300) {
            return "¡Felicidades! Sos un verdadero Chad del RPG";
        } else {
            return "Te falta entrenamiento, joven aprendiz...";
        }
    }

    @Override
    public String mensajeDeConstancia(Jugador jugador) {
        if (jugador.tieneMisionFallida()) {
            System.out.println("Fallaste al menos una mision. Que el backend te tenga piedad...");
        }
        return "";
    }

    @Override
    public String tieneFallos(Jugador jugador) {
        if (jugador.esConstante()) {
            return "¡Ejecución constante! Sos el sueño de un arquitecto de software.";
        }
        return "";
    }
}
