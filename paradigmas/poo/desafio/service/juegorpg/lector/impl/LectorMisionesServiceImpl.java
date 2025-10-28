package paradigmas.poo.desafio.service.juegorpg.lector.impl;

import paradigmas.poo.desafio.dominio.Mision;
import paradigmas.poo.desafio.service.juegorpg.lector.LectorMisionesService;
import paradigmas.poo.desafio.utils.LectorUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LectorMisionesServiceImpl implements LectorMisionesService {
    @Override
    public List<Mision> leerMisiones(int cantidadDeMisiones) {
        Scanner scanner = new Scanner(System.in);
        List<Mision> listaMisiones = new ArrayList<>();

        for (int i = 0; i < cantidadDeMisiones; i++) {
            int numeroMision = i+1;

            System.out.println("Ingrese los puntos obtenidos de la mision N "+numeroMision+": ");

            int puntosObtenidos = LectorUtils.leerEnteroPositivo(scanner);

            listaMisiones.add(new Mision(puntosObtenidos, numeroMision));
        }

        scanner.close();
        return listaMisiones;
    }
}
