import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount;

        System.out.print("Enter the number of times you want to print 'hello world': ");
        amount = sc.nextInt();

        for(int i = 1 ; i <= amount; i++){
            System.out.println("hello world! "+i);
        }

        sc.close();
    }
}
