package paradigmas.poo.desafio.dominio;

import java.util.List;

public class Jugador {

    private List<Mision> misiones;

    public Jugador(List<Mision> misiones) {
        this.misiones = misiones;
    }

    public List<Mision> getMisiones() {
        return misiones;
    }

    public int calcularTotal() {
        int total = 0;
        for (Mision m: misiones) {
            total += m.getPuntaje();
        }
        return total;
    }

    public Mision misionConMayorPuntaje() {
        if (misiones.isEmpty()) {
            return null;
        }

        Mision misionConMayorPuntaje = misiones.getFirst();

        for (Mision m: misiones) {
            if(m.getPuntaje() > misionConMayorPuntaje.getPuntaje()) {
                misionConMayorPuntaje = m;
            }
        }

        return misionConMayorPuntaje;
    }

    public Mision misionConMenorPuntaje() {
        if (misiones.isEmpty()) {
            return null;
        }

        Mision misionConMenorrPuntaje = misiones.getFirst();

        for (Mision m: misiones) {
            if(m.getPuntaje() < misionConMenorrPuntaje.getPuntaje()) {
                misionConMenorrPuntaje = m;
            }
        }

        return misionConMenorrPuntaje;
    }

    public boolean esConstante() {
        return misionConMayorPuntaje().getPuntaje() - misionConMenorPuntaje().getPuntaje() < 20;
    }

    public boolean tieneMisionFallida() {
        for (Mision m: misiones) {
            if (m.esFallida()) {
                return true;
            }
        }
        return false;
    }


}
