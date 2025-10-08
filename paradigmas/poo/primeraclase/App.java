package paradigmas.poo.primeraclase;

public class App {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setCantidadDeRuedas(4);
        auto.setColor("Verde");
        auto.setMarca("Marca X");
        auto.setModelo("2003");


        //Cambiar el estado del atributo color
        auto.setColor("Rojo");
        System.out.println(auto.getColor());

        Auto auto2 = new Auto(4, true, "Marca 1", "Rojo");
        auto2.setModelo("Modelo1");

        Auto auto3 = new Auto(4, "Marca 1","Modelo2", "Rojo");

        Auto[] autos = new Auto[3];
        autos[0] = auto;
        autos[1] = auto2;
        autos[2] = auto3;

        for (int i = 0; i < autos.length; i++) {
            autos[i].mostrar_informacion();
        }

    }
}
