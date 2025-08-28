import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        //hypotenus etle kaatkon trikon no karna

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the side a:");
        a = sc.nextDouble();

        System.out.print("Enter the side b:");  
        b = sc.nextDouble();
        
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("the hypotenus (c) is :"+c+"cm");

        

        sc.close();
    }
}
