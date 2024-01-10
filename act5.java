import java.util.Scanner;

public class act5 {

    public static int menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tria una de les seguents opcions:");
        System.out.println("1. Decimal a binari");
        System.out.println("2. Binari a decimal");
        System.out.println("3. Es parell?");
        System.out.println("4. Calcular parells de 0 fins n");
        System.out.println("0. Sortir");
        
        return sc.nextInt();
    }



    public static void main(String[] args) {
        System.out.println(menu());
      
        System.exit(0); // fin del programa
    }
}