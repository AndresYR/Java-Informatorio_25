package paradigmas.estructurada.desafio;

public class CodeChadsAcademy {
    public static void main(String[] args) {

        // 1º Parte
        /*
        El estudiante debe rendir 5 exámenes. Los primeros 3 puntajes ya están disponibles, 
        pero los dos últimos se deben calcular automáticamente:
        Si la nota 2 fue menor a 60, la nota 4 será 100 (porque hizo un trabajo práctico extra). Si 
        fue mayor a 60 entonces la nota 4 será igual a la nota 2.
        Si la suma de las notas 1 y 3 supera 150, la nota 5 será 95, sino 70.
         */
        System.out.println("-----------------------------------------------------");
        System.out.println("Primera Parte");
        System.out.println("-----------------------------------------------------");
        int[] puntajeExamen = new int[5];

        puntajeExamen[0] = 68;
        puntajeExamen[1] = 70;
        puntajeExamen[2] = 75;
        puntajeExamen[3] = (puntajeExamen[1] < 60)? 100 : puntajeExamen[1];
        int puntajeUnoYTres = puntajeExamen[0] + puntajeExamen[2];
        puntajeExamen[4] = (puntajeUnoYTres > 150)? 95 : 70;

        for (int i = 0; i < puntajeExamen.length; i++) {
            System.out.printf("Examen: %d - Puntaje: %d%n",i+1,puntajeExamen[i]);
        }

        //2º Parte
        /*
         * 1. Verificar si aprobó todas:

        Una nota es aprobada si es mayor o igual a 60. Mostrar si el alumno aprobó todas, ninguna o algunas.
        "Resultado: Aprobaste todas. ¡Backend Sensei!"
        "Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!"
        "Resultado: Algunas aprobadas. Sos un refactor en progreso."
         */

        System.out.println("-----------------------------------------------------");
        System.out.println("Segunda Parte");
        System.out.println("-----------------------------------------------------");
        System.out.println("1 - Verificar si aprobo todas");
        System.out.println("-----------------------------------------------------");

        int examenesAprobados = 0;

        for (int i = 0; i < puntajeExamen.length; i++) {
            if (puntajeExamen[i]>=60) {
                examenesAprobados++;
            }
        }

        if (examenesAprobados == puntajeExamen.length ) {
            System.out.println("Resultado: Aprobaste todas. ¡Backend Sensei!");
        } else if (examenesAprobados == 0) {
            System.out.println("Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!");            
        } else {
            System.out.println("Resultado: Algunas aprobadas. Sos un refactor en progreso."); 
        }

        /*
         * 2. Prueba más inconsistente:
        Detectar cuál fue la mayor variación entre dos pruebas consecutivas y en qué lugar ocurrió.
        "Mayor salto fue de 35 puntos entre la prueba 2 y la prueba 3."
         */
        System.out.println("2 - Prueba más inconsistente");
        System.out.println("-----------------------------------------------------");

        int variacionExamen = Math.abs(puntajeExamen[0]-puntajeExamen[1]);
        int posicionExamen = 0;

        for (int i = 1; i < puntajeExamen.length-1; i++) {
            int variacion = Math.abs(puntajeExamen[i+1]-puntajeExamen[i]);
            if (variacion > variacionExamen) {
                variacionExamen = variacion;
                posicionExamen = i;
            }
        }
        System.out.printf("Mayor salto fue de %d puntos entre la prueba %d y la prueba %d.%n",
        variacionExamen,
        posicionExamen+1,
        posicionExamen+2
        );

        /*
         * 3. Bonus por progreso:
        Si el alumno mejora su nota en cada prueba respecto a la anterior, mostrar:
        "¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈"
         */
        System.out.println("3 - Bonus por progreso");
        System.out.println("-----------------------------------------------------");
         
        
        boolean laMejoraEsProgresiva = true;
        int posicion = 0;

        while (laMejoraEsProgresiva && posicion < puntajeExamen.length-1) {
            int variacion = puntajeExamen[posicion+1]-puntajeExamen[posicion];
            posicion++;
            if (variacion <= 0) {
                laMejoraEsProgresiva = false;
            }
        
        }

        if (laMejoraEsProgresiva) {
            System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento");
        }

        /*
         * 4. Mostrar notas ordenadas (sin usar sort):
        Imprimí las notas ordenadas de mayor a menor sin usar Arrays.sort()
         */
        System.out.println("4 - Mostrar notas ordenadas");
        System.out.println("-----------------------------------------------------");
        
        for (int i = 0; i < puntajeExamen.length; i++) {
            for (int j = 0; j < puntajeExamen.length-1; j++) {
                if (i!=j && puntajeExamen[j]>puntajeExamen[j+1]) {
                    int temp = puntajeExamen[j];
                    puntajeExamen[j] = puntajeExamen[j+1];
                    puntajeExamen[j+1] = temp;
                }
            }
        }
        
        for (int i = 0; i < puntajeExamen.length; i++) {
            System.out.printf("Puntaje: %d%n",puntajeExamen[i]);
        }

        /*
         * 5. Evaluación final por nivel
        Según el total acumulado, mostrar un rango personalizado:

        Total < 250 → "Normie total 😢"
        250–349 → "Soft Chad"
        350–449 → "Chad"
        450+ → "Stone Chad definitivo 💪"

         */

        System.out.println("5 - Evaluación final por nivel");
        System.out.println("-----------------------------------------------------");

        int totalPuntaje = 0;
        for (int i = 0; i < puntajeExamen.length; i++) {
            totalPuntaje+= puntajeExamen[i];
        }
        if (totalPuntaje < 250) {
            System.out.printf("Tu puntaje total es: %d - Tu rango es: Normie Total%n", totalPuntaje);
        } else if (250 < totalPuntaje && totalPuntaje <= 349) {
            System.out.printf("Tu puntaje total es: %d - Tu rango es: Soft Chad%n", totalPuntaje);
        } else if (350 < totalPuntaje && totalPuntaje <= 449) {
            System.out.printf("Tu puntaje total es: %d - Tu rango es: Chad%n", totalPuntaje);
        } else {
            System.out.printf("Tu puntaje total es: %d - Tu rango es: Stone Chad definitivo%n", totalPuntaje);
        }

        /*
         * (Desafío final) Ranking entre varios alumnos
        Simulá una clase con 4 estudiantes, cada uno con sus 5 notas. Mostrá:

        Qué estudiante obtuvo el promedio más alto
        Cuál fue el más regular (menor desviación entre notas).
        Quién tuvo el peor rendimiento en la tercera prueba.
         */
        System.out.println("-----------------------------------------------------");
        System.out.println("6 - Ranking entre varios alumnos");
        System.out.println("-----------------------------------------------------");
        
        int[][] alumnosPuntajes = {
            {56, 75, 64, 80, 85},
            {67, 44, 90, 70, 65},
            {38, 10, 40, 70, 85},
            {80, 85, 90, 80, 85},
        };

        double[] alumnosPromedio = new double[4];
        
        //Determinacion del promedio
        for (int i = 0; i < alumnosPuntajes.length; i++) {
            int puntajeTotal = 0;
            for (int j = 0; j < alumnosPuntajes[i].length; j++) {
                puntajeTotal += alumnosPuntajes[i][j];
            }
            alumnosPromedio[i] = (double) puntajeTotal/alumnosPuntajes[i].length;
        }
        double mayorPromedio = alumnosPromedio[0];
        int alumnoMayorPromedio = 0;
        for (int i = 1; i < alumnosPromedio.length; i++) {
            if (alumnosPromedio[i]>mayorPromedio) {
                mayorPromedio = alumnosPromedio[i];
                alumnoMayorPromedio = i;
            }
        }
        System.out.printf("El alumno con mayor promedio es el %d con un promedio de %.2f%n", 
        alumnoMayorPromedio+1,
        mayorPromedio);

        // Determinacion de la desviacion estandar
        double[] alumnosDesvioEstandar = new double[4];
        for (int i = 0; i < alumnosPuntajes.length; i++) {
            double desviacion = 0;
            for (int j = 0; j < alumnosPuntajes[i].length; j++) {
                desviacion += Math.pow(alumnosPuntajes[i][j]-alumnosPromedio[i],2);
            }
            alumnosDesvioEstandar[i] = Math.sqrt(desviacion/alumnosPuntajes[i].length);
        }

        double menorDesvioEstandar = alumnosDesvioEstandar[0];
        int posicionMenorDesvioEstandar = 0;

        for (int i = 0; i < alumnosDesvioEstandar.length; i++) {
            if (alumnosDesvioEstandar[i]<menorDesvioEstandar) {
                menorDesvioEstandar = alumnosDesvioEstandar[i];
                posicionMenorDesvioEstandar = i;
            }
        }

        System.out.printf("El alumno mas regular es el alumno %d.%n", posicionMenorDesvioEstandar+1);

        //Peor rendimiento en la 3ra prueba
        int peorPuntajeTercerExamen = alumnosPuntajes[0][2];
        int alumnoPeorPuntajeTercerExamen = 0;

        for (int i = 0; i < alumnosPuntajes.length; i++) {
            if (alumnosPuntajes[i][2] < peorPuntajeTercerExamen) {
                peorPuntajeTercerExamen = alumnosPuntajes[i][2];
                alumnoPeorPuntajeTercerExamen = i;
            }
        }
        System.out.printf("El alumno con el peor rendimiento en el tercer examen es el alumno %d con un puntaje de %d%n",
        alumnoPeorPuntajeTercerExamen+1,
        peorPuntajeTercerExamen);
    }
}
