import java.util.Scanner;

public class ifElseStatement {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        age = sc.nextInt();
        sc.nextLine(); // consume the leftover newline character

        if (age >= 18) {
            System.out.println("you're an adult");
        }else if (age < 0) {
            System.out.println("your age can't be negative!");
        }else if (age > 65) {
            System.out.println("you're a senior");
        }
        else{
            System.out.println("you're a minor");
        }


        String name;
        System.out.print("enter your name: ");
        name = sc.nextLine();

        if (name.isEmpty()) {
            System.out.println("you didn't enter your name: ");

        }else{
            System.out.println("Hello "+ name+" :)");
        }


        
        sc.close();
    }
}
