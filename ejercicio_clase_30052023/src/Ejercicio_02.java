public class Ejercicio_02 {
    public static void main(String[] args) {
        String [] array1 = {"mario", "marcos", "roberto", "juan"};

        String Ngrande = array1[0];

        for(int i = 0; i < array1.length; i++) {
            if (array1[i].length() > Ngrande.length()){
                Ngrande = array1[i];
            }
        }
        System.out.println("Palabra mas grande: " + Ngrande);
    }
}

