import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        while (password.length() < 8) {
            if (password.isEmpty()) {
                System.out.println("Empty field is not allowed!\nRe-enter your password");
                password = sc.nextLine();
                
            }else{
                System.out.print("Password length must be equal to or greater than 8\nRe-enter your password: ");
                password = sc.nextLine();
            }
        }

        System.out.println("Jumped out of the loop");

        sc.close();
    }
}
