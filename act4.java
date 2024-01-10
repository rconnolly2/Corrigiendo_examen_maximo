
public class act4 {

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
        primersNombresParells(5);
      
        System.exit(0); // fin del programa
    }
}