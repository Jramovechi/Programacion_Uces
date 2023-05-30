public class condicion_null {
    public static void main(String arg[]){

        prompUser();
    }

    private static void prompUser(){
        String name = "pablo";

        if(name == null || name.trim().isEmpty()){
            System.out.println("No entro su nombre");
        }else{
            System.out.println("Entro su nombre: " + name);
        }
    }
}
