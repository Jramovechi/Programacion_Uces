package Examen1_Ejercicio2;

public class Concesionaria {

    //Atributos
    int idConsec;
    String NombreConsec;
    String marca;
    String modelo;
    int Stock;

    //Metodo
    public void mostrar(){
        System.out.println("\n---SEGUNDA PARTE AUTOS");
        System.out.println("El ID del auto es: " + idConsec);
        System.out.println("El Nombre de la Concesionaria es: " + NombreConsec);
        System.out.println("Su Marca es: " + marca);
        System.out.println("El Modelo es: " + modelo);
        System.out.println("Stock Disponible: " + Stock);
    }

}
