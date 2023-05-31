public class Ejercicio_04 {
    public static void main(String[] args) {
        String [] array1 = {"mario", "marcos", "roberto", "juan"};


        int contador = 0;

        for (int i = 0; i < array1.length; i++) {
            String palabra = array1[i];

            for (int j = 0; j < palabra.length(); j++){
                if ((palabra.charAt(j) == 'a') || (palabra.charAt(j) =='e') || (palabra.charAt(j) =='i') || (palabra.charAt(j) =='o') || (palabra.charAt(j) =='u')){
                    contador++;
                }
                System.out.println("El array contiene " + contador + " vocales");
            }

        }
    }
}
