public class Ejercicio_01 {
    public static void main(String[] args) {
        String [] array1 = {"Mario", "Marcos", "Roberto", "Juan"};

        char caracter = 'M';
        int contador = 0;

        for(String palabra : array1){
            if(palabra.charAt(0) == caracter){
                contador++;
            }
        }
        System.out.println("La cantidad de palabras que contiene la letra " + caracter + " son " + contador);

    }
}
