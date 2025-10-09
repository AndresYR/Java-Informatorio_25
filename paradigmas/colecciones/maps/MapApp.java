package paradigmas.colecciones.maps;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    
    public static void main(String[] args) {
        hashMapExample();
    }

    public static void hashMapExample() {
        Map<String, String> definiciones = new HashMap<>();

        definiciones.put("Java", "Lenguaje de programacion orientado a objetos");
        definiciones.put("Python", "Lenguaje de programacion interpretado y dinamico");
        definiciones.put("C++", "Lenguaje de programacion de alto rendimiento y eficiencia");

        String valor = definiciones.get("Java");
        
        definiciones.remove("Java");

        System.out.println(definiciones);

        System.out.println(definiciones.containsKey("Java"));
        System.out.println(definiciones.containsValue("Lenguaje de programacion interpretado y dinamico"));

        for (Map.Entry<String, String> elemento: definiciones.entrySet()) {
            System.out.println("Clave: "+elemento.getKey()+", Valor: "+elemento.getValue());
        }
    }

}
