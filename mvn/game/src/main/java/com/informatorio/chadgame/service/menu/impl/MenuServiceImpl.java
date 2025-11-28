package com.informatorio.chadgame.service.menu.impl;

import com.informatorio.chadgame.dominio.Jugador;
import com.informatorio.chadgame.repository.jugador.JugadorRepository;
import com.informatorio.chadgame.service.archivos.ArchivosMisionesService;
import com.informatorio.chadgame.service.juegorpg.JuegoRPGService;
import com.informatorio.chadgame.service.menu.MenuService;
import com.informatorio.chadgame.utils.ImpresoraUtils;

import java.util.List;
import java.util.Scanner;

public class MenuServiceImpl implements MenuService {
    private JuegoRPGService juegoRPGService;
    private ArchivosMisionesService archivosMisionesService;
    private JugadorRepository jugadorRepository;

    public MenuServiceImpl(JuegoRPGService juegoRPGService,
                           ArchivosMisionesService archivosMisionesService,
                           JugadorRepository jugadorRepository) {
        this.juegoRPGService = juegoRPGService;
        this.archivosMisionesService = archivosMisionesService;
        this.jugadorRepository = jugadorRepository;
    }

    @Override
    public void seleccionar(Scanner sc) {
        int opcion = 0;
        System.out.println("Bienvenido a ChadQuest RPG");

        do {
            System.out.println("Indique una opcion:");
            System.out.println("1- Imprimir mensaje evaluacion");
            System.out.println("2- Ver constancia");
            System.out.println("3- Ver fallos");
            System.out.println("4- Gernerar archivo de misiones");
            System.out.println("5- Salir");

            opcion=sc.nextInt();
            this.ejecutar(opcion);
        } while (opcion !=5);
//        sc.close();
    }


    private void ejecutar(int opcion) {

        Jugador jugador = jugadorRepository.obtenerJugador();

        switch (opcion) {
            case 1:
                System.out.println("\n");
                String mensajeTieneFallos = juegoRPGService.tieneFallos(jugador);
                String mensajeContancia = juegoRPGService.mensajeDeConstancia(jugador);
                String mensajeEvaluacion = juegoRPGService.evaluar(jugador);

                ImpresoraUtils.imprimirEvaluacion(List.of(mensajeEvaluacion,mensajeContancia,mensajeTieneFallos));
                System.out.println("\n");
                break;
            case 2:
                System.out.println("\n");
                System.out.println(juegoRPGService.mensajeDeConstancia(jugador));
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n");
                System.out.println(juegoRPGService.tieneFallos(jugador));
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\n");
                archivosMisionesService.exportarMisionesCSV(jugador.getMisiones());
                System.out.println("\n");
                break;
            case 5:
                System.out.println("\n");
                System.out.println("Adios");
                System.out.println("\n");
                break;
            default:
                break;

        }

    }
}
