package Ejercicios;

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        // Intento A:
        //saldo += saldo * tasaInteres;

        // Intento B:
        // double saldoActual = getSaldo();
        // super.setSaldo(saldoActual + (saldoActual * tasaInteres));
    }
}

public class Ejercicio6 {
}
