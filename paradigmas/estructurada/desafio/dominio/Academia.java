package paradigmas.estructurada.desafio.dominio;

import java.util.List;

public class Academia {

    private List<Estudiante> estudiantes;

    public Academia(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void comprobacionDeExamenes(Estudiante estudiante) {
        //Cantidad de examenes aprobados
        String mensaje;
        switch (estudiante.examenesAprobados()) {
            case "todos":
                mensaje = "Resultado: Aprobaste todas. ¡Backend Sensei!";
            case "ninguno":
                mensaje = "Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!";
            case "algunos":
                mensaje = "Resultado: Algunas aprobadas. Sos un refactor en progreso.";
        }

        //Mayor Inconsistencia
        List<Integer> mayorInconsistencia = estudiante.mayorInconsistencia();
        System.out.printf("Mayor salto fue de %d puntos entre los examenes %d y %d.%n",
                mayorInconsistencia.get(0),
                mayorInconsistencia.get(1),
                mayorInconsistencia.get(2));

        //Bonus por Progreso
        if (estudiante.bonusPorProgreso()) {
            System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento");
        }

        //Mostrar notas ordenadas
        List<Examen> notasOrdenadas = estudiante.notasOrdenadas();
        for (Examen n: notasOrdenadas) {
            System.out.println("Examen: "+n.getNumero()+" - Nota: "+n.getNota());
        }
        
        //Evaluación final
        System.out.println("Evaluación final:");
        int notaTotal = estudiante.notaTotal();
        if (notaTotal < 250) {
            System.out.printf("Tu puntaje total es: %d - Tu rango es: Normie Total%n", notaTotal);
        } else if (250 < notaTotal && notaTotal <= 349) {
            System.out.printf("Tu puntaje total es: %d - Tu rango es: Soft Chad%n", notaTotal);
        } else if (350 < notaTotal && notaTotal <= 449) {
            System.out.printf("Tu puntaje total es: %d - Tu rango es: Chad%n", notaTotal);
        } else {
            System.out.printf("Tu puntaje total es: %d - Tu rango es: Stone Chad definitivo%n", notaTotal);
        }
    }

    public Estudiante mejorPromedio() {
        Estudiante mejorPromedio = estudiantes.getFirst();

        for (int i = 1; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getPromedio() > mejorPromedio.getPromedio()) {
                mejorPromedio = estudiantes.get(i);
            }
        }
        System.out.printf("El alumno con mejor promedio es %s con un promedio de %.2f%n",
                mejorPromedio.getNombre(),
                mejorPromedio.getPromedio());
        return mejorPromedio;
    }

    public Estudiante mejorConstancia() {
        Estudiante menorDesvioEstandar = estudiantes.getFirst();

        for (int i = 1; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getDesvioEstandar() < menorDesvioEstandar.getDesvioEstandar()) {
                menorDesvioEstandar = estudiantes.get(i);
            }
        }
        System.out.println("El alumno más constante es "+ menorDesvioEstandar.getNombre());
        return  menorDesvioEstandar;
    }


    public Estudiante peorRendimientoExamenN(int numeroExamen) {
        try {
            Estudiante peorRendmiento = null;
            for (Estudiante e: estudiantes) {
                Integer nota = e.getNotaExamenN(numeroExamen);

                if (nota == null) {
                    continue;
                }
                if (peorRendmiento == null || nota < peorRendmiento.getNotaExamenN(numeroExamen)) {
                    peorRendmiento = e;
                }
            }
            if (peorRendmiento == null) {
                System.out.println("El examen "+ numeroExamen+" no existe");
                return null;
            }
            System.out.printf("El alumno con peor rendimiento fue %s con una nota de %d%n",
                    peorRendmiento.getNombre(),
                    peorRendmiento.getNotaExamenN(numeroExamen));
            return peorRendmiento;
        } catch (Exception e) {
            System.out.println("Error al buscar el peor rendimiento: "+e.getMessage());
            return null;
        }
    }
}
