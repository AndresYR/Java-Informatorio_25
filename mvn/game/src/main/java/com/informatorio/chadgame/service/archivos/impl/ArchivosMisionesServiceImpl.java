package com.informatorio.chadgame.service.archivos.impl;

import com.informatorio.chadgame.dominio.Mision;
import com.informatorio.chadgame.service.archivos.ArchivosMisionesService;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Struct;
import java.util.List;

public class ArchivosMisionesServiceImpl implements ArchivosMisionesService {

    private final String UBICACION_ARCHIVO = "\\src\\main\\java\\com\\informatorio\\chadgame\\resource\\";

    CSVWriter csvWriter;

    @Override
    public void exportarMisionesCSV(List<Mision> misiones) {
        String ruta = System.getProperty("user.dir").concat(UBICACION_ARCHIVO).concat("misiones-realizadas.csv");
        try {
            this.csvWriter = new CSVWriter(new FileWriter(ruta));

            String[] encabezado = {"NUMERO", "PUNTAJE"};
            this.csvWriter.writeNext(encabezado);

            for (Mision mision : misiones) {
                String[] datos = {Integer.toString(mision.getNumero()), Integer.toString(mision.getPuntaje())};
                this.csvWriter.writeNext(datos);
            }

            System.out.println("Exportación exitosa!!!");
            this.cerrarWriter();

        } catch (IOException e) {
            System.out.println("Algo salio mal. Motivo: " + e.getMessage().concat("Ubicacion archivo: "+ruta));
        }
    }

    private void cerrarWriter() {
        if (this.csvWriter != null) {
            try {
                this.csvWriter.close();
            } catch (IOException e) {
                System.out.println("Algo salio mal. Motivo: "+ e.getMessage());
            }
        }
    }
}
