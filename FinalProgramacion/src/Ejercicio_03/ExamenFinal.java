package Ejercicio_03;

public class ExamenFinal {

    public static void main(String[] args) {

        //Inicializamos nuestro array con un indice de 3
        CuentaBancaria[] cuenta = new CuentaBancaria[3];
        cuenta[0]= new CuentaBancaria(213659, 100000);
        cuenta[1]= new CuentaBancaria(335458,850000);
        cuenta[2]= new CuentaBancaria(550005 ,15000);

        //Inicializamos 2 variables para realizar nuestro bucle
        int mayorCuenta = cuenta[0];
        int estMayor = 0;
        for(int i = 0; i <= cuenta.length; i++){
            if(cuenta[i].getSaldo() > mayorCuenta ){
                mayorCuenta = cuenta[i].getSaldo();
                estMayor = i;
            }
        }
        System.out.println("La cuenta más alta es:  " + cuenta[estMayor].getNumCuenta() + " tiene un saldo de: "+ cuenta[estMayor].getSaldo());
    }
}
