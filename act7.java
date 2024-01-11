import java.util.Scanner;

public class act7 {

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

    public static double volumCilindre(double radi, double longitud) {
        return Math.PI*Math.pow(radi, 2)*longitud;
    }

    public static double volumPrismaRectangular(double costat1, double costat2, double costat3) {
        return costat1*costat2*costat3;
    }





    public static void main(String[] args) {
        System.out.println(volumCilindre(5.0, 7.0));
        System.out.println(volumPrismaRectangular(17.0, 12.0, 10.0));

        System.exit(0); // fin del programa
    }
}