package com.informatorio.chadgame.service.lector;

import com.informatorio.chadgame.dominio.Mision;

import java.util.List;
import java.util.Scanner;

public interface LectorMisionesService {
    void leerMisiones(int cantidadDeMisiones, Scanner scanner);
}
