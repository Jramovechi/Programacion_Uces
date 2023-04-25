package Examen1_Ejercicio1;

class Main {

    public static void main(String[] args) {

        Libro Lib = new Libro();
        Lib.idLibro = 1;
        Lib.titulo = "Libro1";
        Lib.genero = "Terror";
        Lib.autor = "Autor1";
        Lib.creacion = 2020;

        Lib.mostrarAutor();
        Lib.mostrarLibroGenero();

        Libro Lib2 = new Libro();
        Lib2.idLibro = 2;
        Lib2.titulo = "Libro2";
        Lib2.genero = "Ficcion";
        Lib2.autor = "Autor2";
        Lib2.creacion = 1992;

        Lib2.mostrarAutor();
        Lib2.mostrarLibroGenero();

        Libro Lib3 = new Libro();
        Lib3.idLibro = 3;
        Lib3.titulo = "Libro3";
        Lib3.genero = "Comedia";
        Lib3.autor = "Autor3";
        Lib3.creacion = 1965;

        Lib3.mostrarAutor();
        Lib3.mostrarLibroGenero();

        Libro Lib4 = new Libro();
        Lib4.idLibro = 4;
        Lib4.titulo = "Libro4";
        Lib4.genero = "Historia";
        Lib4.autor = "Autor4";
        Lib4.creacion = 2021;

        Lib4.mostrarAutor();
        Lib4.mostrarLibroGenero();

        Libro Lib5 = new Libro();
        Lib5.idLibro = 5;
        Lib5.titulo = "Libro5";
        Lib5.genero = "Terror";
        Lib5.autor = "Autor5";
        Lib5.creacion = 1992;

        Lib5.mostrarAutor();
        Lib5.mostrarLibroGenero();
    }
}
