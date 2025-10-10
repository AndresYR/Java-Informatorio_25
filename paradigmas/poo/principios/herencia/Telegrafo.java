package paradigmas.poo.principios.herencia;

public class Telegrafo extends  Mensajero{
    public Telegrafo(String destino) {
        super(destino);
    }

    @Override
    public void enviarMensaje(String contenido) {
        System.out.println("Telegrafo envia un mensaje con el contenido : "+ contenido +
                " Hacia detino " + super.getDestino());
    }


}
