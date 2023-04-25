package Examen1_Ejercicio2;

class Main {
    public static void main(String[] args) {

        Concesionaria Con1 = new Concesionaria();
        Con1.idConsec = 1;
        Con1.NombreConsec = "Ford Oficial";
        Con1.marca = "Ford";
        Con1.modelo = "Fiesta KD";
        Con1.Stock = 10;

        Con1.mostrar();


        Concesionaria Con2 = new Concesionaria();
        Con2.idConsec = 2;
        Con2.NombreConsec = "Chevrolet Oficial";
        Con2.marca = "Chevrolet";
        Con2.modelo = "Cruze LTZ";
        Con2.Stock = 20;

        Con2.mostrar();

        Concesionaria Con3 = new Concesionaria();
        Con3.idConsec = 3;
        Con3.NombreConsec = "Fiat Oficial";
        Con3.marca = "Fiat";
        Con3.modelo = "Fiat 1";
        Con3.Stock = 22;

        Con3.mostrar();

        Concesionaria Con4 = new Concesionaria();
        Con4.idConsec = 4;
        Con4.NombreConsec = "Toyota Concesionaria";
        Con4.marca = "Toyota";
        Con4.modelo = "Corolla";
        Con4.Stock = 2;

        Con4.mostrar();

        Concesionaria Con5 = new Concesionaria();
        Con5.idConsec = 5;
        Con5.NombreConsec = "Honda Oficial";
        Con5.marca = "Honda";
        Con5.modelo = "Civic";
        Con5.Stock = 5;

        Con5.mostrar();

        //Resolucion punto 3
        int sumaStock = Con1.Stock + Con2.Stock + Con3.Stock + Con4.Stock + Con5.Stock;

        int resultadoResta = sumaStock - 4;

        int promAutos = sumaStock / 12;


        System.out.println("\n---TERCERA PARTE AUTOS");
        System.out.println("La Suma de Stock es: " + sumaStock );
        System.out.println("La resta de Stock es: " + resultadoResta);
        System.out.println("Promedio de autos es: " + promAutos);

    }
}
