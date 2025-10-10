package paradigmas.poo.principios.herencia;

public class Celular extends  Mensajero{
    private boolean estaSinBateria;

    public Celular(String destino, boolean estaSinBateria) {
        super(destino);
        this.estaSinBateria = estaSinBateria;
    }

    @Override //Sirve para sobreescribir metodos
    public void enviarMensaje(String contenido) {
        if (!estaSinBateria) {
            System.out.println("Mensaje de celular : "+ contenido + " Hacia detino " + super.getDestino());
        }
    }


    public boolean isEstaSinBateria() {
        return estaSinBateria;
    }

    public void setEstaSinBateria(boolean estaSinBateria) {
        this.estaSinBateria = estaSinBateria;
    }
}
