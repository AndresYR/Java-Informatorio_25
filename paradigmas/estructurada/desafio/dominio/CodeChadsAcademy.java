package paradigmas.estructurada.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class CodeChadsAcademy {
    public static void main(String[] args) {
        List<Examen> examenes1 = new ArrayList<Examen>();
        examenes1.add(new Examen(67,1));
        examenes1.add(new Examen(60,2));
        examenes1.add(new Examen(68,3));
        examenes1.add(new Examen(65,4));
        examenes1.add(new Examen(77,5));

        List<Examen> examenes2 = new ArrayList<Examen>();
        examenes2.add(new Examen(60,1));
        examenes2.add(new Examen(65,2));
        examenes2.add(new Examen(70,3));
        examenes2.add(new Examen(75,4));
        examenes2.add(new Examen(80,5));

        List<Examen> examenes3 = new ArrayList<Examen>();
        examenes3.add(new Examen(61,1));
        examenes3.add(new Examen(99,2));
        examenes3.add(new Examen(75,3));
        examenes3.add(new Examen(98,4));
        examenes3.add(new Examen(80,5));

        Estudiante estudiante1 = new Estudiante("Jose", examenes1);
        Estudiante estudiante2 = new Estudiante("Pedro", examenes2);
        Estudiante estudiante3 = new Estudiante("Manuel", examenes3);

        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        Academia academia = new Academia(estudiantes);

        //academia.comprobacionDeExamenes(estudiante2);
        Estudiante mejorEstudiante = academia.mejorPromedio();
        academia.comprobacionDeExamenes(mejorEstudiante);
        Estudiante masConstante = academia.mejorConstancia();
        academia.comprobacionDeExamenes(masConstante);
    }
}
