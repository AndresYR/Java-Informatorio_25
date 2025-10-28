package paradigmas.poo.desafio.service.juegorpg.lector;

import paradigmas.poo.desafio.dominio.Mision;

import java.util.List;

public interface LectorMisionesService {
    List<Mision> leerMisiones(int cantidadDeMisiones);
}
