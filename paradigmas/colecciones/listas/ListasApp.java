package paradigmas.colecciones.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class  ListasApp {
    
    public static void main(String[] args) {
        // listArrayExample();
        finalExample();
    }

    private static void listArrayExample() {
        //Es eficiente para recorrer la lista
        ArrayList<String> nombresUsuarios = new ArrayList<String>();
        nombresUsuarios.add("Juan");
        nombresUsuarios.add("Pedro");
        nombresUsuarios.add("Maria");

        ArrayList<String> nombresUsuarios2 = new ArrayList<String>();
        nombresUsuarios.add("Ian");
        nombresUsuarios.add("Jose");

        nombresUsuarios.addAll(nombresUsuarios2);

        System.out.println(nombresUsuarios);
    }

    private static void linkedListArrayExample() {
        //Es eficiente para insertar y eliminar datos
        LinkedList<String> tareasPendientes = new LinkedList<String>();
        tareasPendientes.add("Hacer la compra");
        tareasPendientes.add("Ir al gimnasio");
        tareasPendientes.add("Estudiar para el examen");
    }

    private static void finalExample() {
        List<String> nombresUsuarios = new ArrayList<String>();
        nombresUsuarios.add("Juan");
        nombresUsuarios.add("Pedro");
        nombresUsuarios.add("Maria");

        List<String> linkedNombresUsuarios = new LinkedList<>(nombresUsuarios);
        System.out.println(linkedNombresUsuarios);
    }
}
