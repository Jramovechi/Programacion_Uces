public class Main {
    public static void main(String[] args) {

        String nombre [] = {"Carlos", "Ricardo", "Roberto"};
        System.out.println("El nombre es: " + nombre[0]);
        System.out.println("El nombre es: " + nombre[2]);
        System.out.println("El nombre es: " + nombre[1]);

        for(int i = 0;i<nombre.length;i++){
            System.out.println(nombre[i]);
        }
    }
}