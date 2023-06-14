package Ejercicio_objetos_3;

import Ejercicio_array_objeto_2.Empleado;

public class Main {
    public static void main(String[] args) {

        Producto[] productos = {
                new Producto("Pincel" , 300, 8),
                new Producto("Lapiz", 100, 2),
                new Producto("Cuaderno", 500, 6)
        };

        for(Producto producto : productos){
            double totalPrecio = producto.getPrecio() * producto.getCantidad();
            System.out.println("El empleado: " + producto.getNombre() + " tiene un salario de: " + totalPrecio );
        }

    }
}

