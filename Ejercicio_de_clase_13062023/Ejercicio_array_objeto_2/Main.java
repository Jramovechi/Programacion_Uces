package Ejercicio_array_objeto_2;

import Ejercicio_array_objetos.Estudiante;

public class Main {
    public static void main(String[] args) {

        Empleado[] empleados = {
                new Empleado("Jose" , 20000, 8),
                new Empleado("Luis", 33000, 2),
                new Empleado("Eduardo", 18000, 6)
        };

        for(Empleado empleado : empleados){
            empleado.calcularSalario();
            System.out.println("El empleado: " + empleado.getNombre() + " tiene un salario de: " + empleado.getSalario() );
        }

    }
}

