import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        // ternary operator

        boolean isOnline = false;

        String result = isOnline ? "User is online :)" : "User is offline :(";
        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        String isAllowed = (age >= 18) ? "you're allowed to see this content" : "you must be 18 or above years old to see this content!";

        System.out.println(isAllowed);

        
    }
}
