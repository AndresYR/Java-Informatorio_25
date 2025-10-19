package paradigmas.estructurada.desafio.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Estudiante {

    private String nombre;
    private List<Examen> examenes;

    public Estudiante(String nombre, List<Examen> examenes) {
        this.nombre = nombre;
        this.examenes = examenes;
    }

    public List<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<Examen> examenes) {
        this.examenes = examenes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int notaTotal() {
        int total = 0;
        for (Examen e: examenes) {
            total += e.getNota();
        }
        return total;
    }

    public String examenesAprobados() {
        int examenesAprobados = 0;

        for (Examen e: examenes) {
            if (e.estaAprobado()) {
                examenesAprobados++;
            }
        }
        if (examenesAprobados == examenes.size() ) {
            return "todos";
        } else if (examenesAprobados == 0) {
            return "ninguno";
        } else {
            return "algunos";
        }
    }

    public List<Integer> mayorInconsistencia() {
        int variacionExamen = Math.abs(examenes.get(1).getNota()-examenes.get(0).getNota());
        int examenNumero = 0;

        for (int i = 1; i < examenes.size()-1; i++) {
            int variacion = Math.abs(examenes.get(i+1).getNota() - examenes.get(i).getNota());
            if (variacion > variacionExamen) {
                variacionExamen = variacion;
                examenNumero = i;
            }
        }

        return List.of(variacionExamen, examenNumero, examenNumero+1);
    }

    public boolean bonusPorProgreso() {
        for (int i = 0; i < examenes.size() - 1; i++) {
            int variacion = examenes.get(i+1).getNota() - examenes.get(i).getNota();
            if (variacion <= 0) {
                return false;
            }
        }
        return true;
    }

    public List<Examen> notasOrdenadas() {
        List<Examen> notasOrdenadas = new ArrayList<Examen>(examenes);

        for (int i = 0; i < notasOrdenadas.size(); i++) {
            for (int j = 0; j < notasOrdenadas.size()-1; j++) {
                if (i != j && notasOrdenadas.get(j).getNota() > notasOrdenadas.get(j+1).getNota()) {
                    Collections.swap(notasOrdenadas,j,j+1);
                }
            }
        }
        return notasOrdenadas;
    }

    public double getPromedio() {
        return (double) this.notaTotal() / examenes.size();
    }

    public double getDesvioEstandar() {
        double desvio = 0;
        double promedio = this.getPromedio();

        for (Examen e: examenes) {
            desvio += Math.pow(e.getNota()-promedio,2);
        }

        return Math.sqrt(desvio/examenes.size());
    }

    public Integer getNotaExamenN(int n) {
        Examen nExamen = examenes.stream().filter(e -> e.getNumero()==n).findFirst().orElse(null);
        if (nExamen != null) {
            return nExamen.getNota();
        }
        return null;
    }



    //Testeo
    public static void main(String[] args) {
        List<Examen> examenes = new ArrayList<Examen>();
        examenes.add(new Examen(98,1));
        examenes.add(new Examen(60,2));
        examenes.add(new Examen(74,3));
        examenes.add(new Examen(40,4));
        Estudiante estudiante = new Estudiante("Jose",examenes);

        List<Examen> notas = estudiante.notasOrdenadas();
        for (Examen n: notas) {
            System.out.println("Examen: "+n.getNumero()+" - Nota: "+n.getNota());
        }
        System.out.println(estudiante.getPromedio());
        System.out.println(estudiante.getDesvioEstandar());
        System.out.println(estudiante.getNotaExamenN(6));
    }
}
