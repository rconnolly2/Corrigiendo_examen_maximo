
public class act2 {

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

    public static void main(String[] args) {
        BinDec(110);
      
        System.exit(0); // fin del programa
    }
}