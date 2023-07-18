package Ejercicio_02;

public class ExamenFinal {
        public static void main(String[] args) {

            //Declaramos nuestro Array y Variables
            int arrayEnteros[]={1,25,3,664,55,6,7,865,9,1000};
            int acumulador=0;
            int i=0;

            //Bucle para recorrer nuestro array y sumar nuestros valores
            for (i=0; i<arrayEnteros.length; i++){
                acumulador+= arrayEnteros[i];

            }
            System.out.println("La sumatoria de los numeros es= "+acumulador);
        }
    }
