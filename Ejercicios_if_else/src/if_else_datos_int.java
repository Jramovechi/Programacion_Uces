public class if_else_datos_int {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 6;
        int num3 = 7;
        int promedio = 0;

        promedio = (num1+num2+num3)/3;

        if(promedio >= 4) {
            System.out.println("El alumno: " + promedio);
        }else {
            System.out.println("El alumno reprobo: " + promedio);
        }
    }
}
