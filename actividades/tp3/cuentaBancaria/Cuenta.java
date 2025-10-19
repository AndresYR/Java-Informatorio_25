package actividades.tp3.cuentaBancaria;

public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void extraer(double monto) {
        if ((this.saldo - monto) > 0) {
            this.saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

}
