package actividades.tp3.cuentaBancaria;

public class App {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Andres",100);

        cuenta.depositar(50);
        System.out.println("Saldo: "+cuenta.getSaldo());

        cuenta.extraer(200);
        System.out.println("Saldo: "+cuenta.getSaldo());
    }
}
