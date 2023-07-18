package Ejercicio_03;

public class CuentaBancaria {
        private int numCuenta;
        private int saldo;

    public CuentaBancaria (int numCuenta, int saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;

    }
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
