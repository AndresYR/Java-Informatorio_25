package com.informatorio.chadgame;

import com.informatorio.chadgame.repository.jugador.JugadorRepository;
import com.informatorio.chadgame.repository.jugador.impl.JugadorRepositoryImpl;
import com.informatorio.chadgame.repository.misiones.MisionRepository;
import com.informatorio.chadgame.repository.misiones.impl.MisionRepositoryImpl;
import com.informatorio.chadgame.service.archivos.ArchivosMisionesService;
import com.informatorio.chadgame.service.archivos.impl.ArchivosMisionesServiceImpl;
import com.informatorio.chadgame.service.juegorpg.JuegoRPGService;
import com.informatorio.chadgame.service.juegorpg.impl.JuegoRPGServiceImpl;
import com.informatorio.chadgame.service.lector.LectorMisionesService;
import com.informatorio.chadgame.service.lector.impl.LectorMisionesServiceImpl;
import com.informatorio.chadgame.service.menu.MenuService;
import com.informatorio.chadgame.service.menu.impl.MenuServiceImpl;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        JuegoRPGService juegoRPGService = new JuegoRPGServiceImpl();
        MisionRepository misionRepository = new MisionRepositoryImpl();
        JugadorRepository jugadorRepository = new JugadorRepositoryImpl();
        LectorMisionesService lectorMisionesService = new LectorMisionesServiceImpl(misionRepository);
        ArchivosMisionesService archivosMisionesService = new ArchivosMisionesServiceImpl();


        lectorMisionesService.leerMisiones(5, scanner);
        jugadorRepository.guardar(misionRepository.obtenerMisiones());

        MenuService menuService = new MenuServiceImpl(juegoRPGService, archivosMisionesService,jugadorRepository);
        menuService.seleccionar(scanner);
        scanner.close();
    }
}
