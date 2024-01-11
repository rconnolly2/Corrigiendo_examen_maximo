import java.util.Scanner;

public class act6 {

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

    public static void decimalBinario(int n) {
        String n_bin = "";
        String resultado = "";
        while(n>=1) {
            n_bin += n%2;
            n = n/2;
        }

        for (int i=n_bin.length()-1; i>=0; i--) { // invierto str
            resultado += n_bin.charAt(i);
        }
        System.out.println(resultado);
    }

    public static void BinDec(int bin) {
        int n_dec = 0;

        int i = 0;
        while(bin>=1) {
            n_dec += (Math.pow(2, i)*(bin%10));
            bin = (bin/10);
            i++;
        }
        System.out.println(n_dec);
    }

    public static boolean esParell(int n) {
        if (n%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void primersNombresParells(int n) {
        System.out.println("Números pares: ");
        for (int i = 0; i<n; i++) {
            if (esParell(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean prog_ejec = true;
        int n = 0;
        while (prog_ejec==true) {
            int opcion = menu();
            if (opcion == 0) {
                System.out.println("Programa acaba...");
                prog_ejec=false;
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Numero decimal: ");
                    n = sc.nextInt();
                    decimalBinario(n);
                    break;

                case 2:
                    System.out.println("Numero binario: ");
                    n = sc.nextInt();
                    BinDec(n);
                    break;

                case 3:
                    System.out.println("Dame un numero y te dire si es par : ");
                    n = sc.nextInt();
                    System.out.println(esParell(n));
                    break;

                case 4:
                    System.out.println("Dame un numero y te dire los números del 0 al numero si son pares: ");
                    n = sc.nextInt();
                    primersNombresParells(n);
                    break;
                default:
                    System.out.println("Opción invalida: Prueba otra vez...");
            }
        }
      
        System.exit(0); // fin del programa
    }
}