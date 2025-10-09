package paradigmas.colecciones.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetApp {
    public static void main(String[] args) {
        treeSetExample();
    }

    private static void hashSetExample() {
        Set<String> set = new HashSet();
        set.add("Manzana");
        set.add("Naranja");
        set.add("Pera");
        set.add("fruta1");
        set.add("fruta2");
        set.add("fruta3");
        set.add("fruta4");

        set.remove("Naranja");

        if (!set.contains("Naranja")) {
            System.out.println("El conjunto no contienen la naranja");
        }

        if (!set.isEmpty()) {
            System.out.println("el conjunto no esta vacio");
        }

        for (String elemento: set) {
            System.out.println(elemento);
        }

        //Iterador
        Iterator<String> iterador = set.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }

    private static void treeSetExample() {
        TreeSet<String> set = new TreeSet<>();
        //Este si guarda un orden de los elementos
        set.add("manzana");
        set.add("naranja");
        set.add("naranja");
        set.add("pera");
        set.add("uva");

        String firstElement = set.first();

        System.out.println("FirstElement: "+firstElement);

        Set subSet = set.subSet("manzana", "pera"); //arma un subset con los elementos entre manzana y pera

        System.out.println("Subset: "+subSet);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Object nextElement = iterator.next();
            System.out.println(nextElement.toString());
        }
    }
}
