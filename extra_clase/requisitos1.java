import java.util.Scanner; 

public class requisitos1 {

    public static boolean check_creds(String username, String password) {
        String user = "admin";
        String pass = "admin";

        if (username.equals(user) && password.equals(pass)) {
            return true;
        } else {
            return false;
        }
    }

    public static void login_try(String username, String password, Scanner obj_scan) {
        int amount_attempts = 0;
        while(amount_attempts<2) {

            if (check_creds(username, password) == true) {
                amount_attempts++;
                System.out.println("You are in!" + " attempts: " + amount_attempts);
                break;
            } else {
                amount_attempts++;
                System.out.println("Wrong! try again" + " attempts: " + amount_attempts);

            }
                username = obj_scan.nextLine();
                password = obj_scan.nextLine();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un usuario y contrasena: ");
        String usuario = scanner.nextLine();
        String contrasena = scanner.nextLine();
        login_try(usuario, contrasena, scanner);


        System.exit(0); // fin del programa
    }
}