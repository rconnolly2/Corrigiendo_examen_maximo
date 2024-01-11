import java.util.Scanner;

public class act8 {

    public static double volumCilindre(double radi, double longitud) {
        return Math.PI*Math.pow(radi, 2)*longitud;
    }

    public static double volumPrismaRectangular(double costat1, double costat2, double costat3) {
        return costat1*costat2*costat3;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo_carga = 0;
        while (tipo_carga != 1 && tipo_carga != 2) {
            System.out.println("Que has de transportar? 1. Liquids 2. Solids");
            tipo_carga = sc.nextInt();
            if (tipo_carga != 1 && tipo_carga != 2) {
                System.out.println("Tipo de carga no valido...");
            }
        }

        if (tipo_carga==1) {
            System.out.println("Cuantos centímetros de radio tiene la cisterna?");
            double radio = sc.nextFloat();
            System.out.println("Cuantos centímetros de longitud tiene la cisterna?");
            double longitud = sc.nextFloat();
            System.out.println("Cuantos metros cúbicos tenemos que transportar?");
            double m2_necesarios = sc.nextFloat();
            double m2_disponible = volumCilindre(radio, longitud)/1000000;
            System.out.println("El camion tiene capacidad para: " + m2_disponible);
            System.out.println("Tendrás que hacer " + Math.round(m2_necesarios/m2_disponible) + " viajes");
        } else if (tipo_carga==2) {
            System.out.println("Dame los 3 lados de la cisternas en cm: ");
            float lado1 = sc.nextFloat();
            float lado2 = sc.nextFloat();
            float lado3 = sc.nextFloat();
            double m2_disponible = volumPrismaRectangular(lado1, lado2, lado3)/1000000;
            System.out.println("Cuantos metros cúbicos tenemos que transportar?");
            double m2_necesarios = sc.nextFloat();
            System.out.println("El camion tiene capacidad para: " + m2_disponible + " metros");
            System.out.println("Tendrás que hacer " + Math.round(m2_necesarios/m2_disponible) + " viajes");
        }

        System.exit(0); // fin del programa
    }
}