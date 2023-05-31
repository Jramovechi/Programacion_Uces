public class Ejercicio_04 {
    public static void main(String[] args) {
        String [] array1 = {"mario", "marcos", "roberto", "juan"};

        int contador = 0;

        for (String palabra : array1){

            for (int j = 0; j < palabra.length(); j++){
                char letra = Character.toLowerCase(palabra.charAt(j)) ;
                if ((letra == 'a') || (letra =='e') || (letra =='i') || (letra =='o') || (letra =='u')){
                    contador++;
                }
                System.out.println("El array contiene " + contador + " vocales");
            }

        }
    }
}
