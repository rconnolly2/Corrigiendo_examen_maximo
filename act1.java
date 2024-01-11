import java.util.Scanner;

public class act1 {

    public static void decimalBinario(int n) {
        String n_bin = "";
        while(n>=1) {
            n_bin += n%2;
            n = n/2;
        }

        for (int i=n_bin.length()-1; i>=0; i--) { // invierto str
            System.out.println(n_bin.charAt(i));
        }

    }

    public static void main(String[] args) {
        decimalBinario(6);
      
        System.exit(0); // fin del programa
    }
}