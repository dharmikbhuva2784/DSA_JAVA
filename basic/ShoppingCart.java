import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy");
        item = sc.nextLine();

        System.out.println("what's the price for each: ");
        price = sc.nextDouble();

        System.out.println("how many would you like:");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("Your have bought "+quantity+ " "+item);

        System.out.println("your total is "+currency+total);

        System.out.println("Thank you!");
        
        sc.close();
    }
}
