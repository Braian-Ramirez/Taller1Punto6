import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero, contador;
        contador = 1;
        Scanner scan = new Scanner( System.in);
        try {
            while( contador <= 5 ){
                System.out.println("Ingrese un número mayor o igual a 74 y menor o igual a 189: ");
                numero = scan.nextInt();
                if( numero >= 74 && numero <= 189){
                    if( numero % 2 == 0){
                        if( numero % 5 == 0){
                            System.out.println(" El número ingresado es valido");
                            contador = contador +1;
                        }
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e);

        }
    }
}