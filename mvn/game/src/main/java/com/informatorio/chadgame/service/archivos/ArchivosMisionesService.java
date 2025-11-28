package com.informatorio.chadgame.service.archivos;

import com.informatorio.chadgame.dominio.Mision;

import java.util.List;

public interface ArchivosMisionesService {

    void exportarMisionesCSV(List<Mision> misiones);

}
