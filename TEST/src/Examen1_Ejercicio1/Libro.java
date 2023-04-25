package Examen1_Ejercicio1;

public class Libro {

    //Atributos
    int idLibro;
    String titulo;
    String genero;
    String autor;
    int creacion;

    //Metodos
    public void mostrarAutor(){
        System.out.println("\n---SEGUNDA PARTE AUTOR");
        System.out.println("El ID del libro es: " + idLibro);
        System.out.println("El Titulo es: " + titulo);
        System.out.println("Su Autor es: " + autor);
        System.out.println("El año de creacion es: " + creacion);
    }

    public void mostrarLibroGenero() {
        System.out.println("\n---SEGUNDA PARTE GENERO");
        System.out.println("El ID del libro es: " + idLibro);
        System.out.println("El Titulo es: " + titulo);
        System.out.println("Su Genero es: " + genero);
        System.out.println("El año de creacion es: " + creacion);
    }
}
