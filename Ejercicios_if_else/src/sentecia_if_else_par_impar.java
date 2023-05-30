import java.util.*;

public class sentecia_if_else_par_impar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int Numero;
        System.out.print("Introduzca Número entero: ");
            Numero = sc.nextInt();

        if(Numero%2==0){

            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
