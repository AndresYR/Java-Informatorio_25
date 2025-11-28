package com.informatorio.chadgame.service.lector.impl;

import com.informatorio.chadgame.repository.misiones.MisionRepository;
import com.informatorio.chadgame.service.lector.LectorMisionesService;
import com.informatorio.chadgame.utils.LectorUtils;

import java.util.Scanner;

public class LectorMisionesServiceImpl implements LectorMisionesService {

    private MisionRepository misionRepository;

    public LectorMisionesServiceImpl(MisionRepository misionRepository) {
        this.misionRepository = misionRepository;
    }

    @Override
    public void leerMisiones(int cantidadDeMisiones, Scanner scanner) {
//        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cantidadDeMisiones; i++) {
            int numeroMision = i+1;

            System.out.println("Ingrese los puntos obtenidos de la mision N "+numeroMision+": ");

            int puntosObtenidos = LectorUtils.leerEnteroPositivo(scanner);

            this.misionRepository.guardar(puntosObtenidos, numeroMision);

        }

//        scanner.close();
    }
}
