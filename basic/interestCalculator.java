import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter the principle amount: ");
        principal = sc.nextDouble();

        System.out.println("enter the interest rate (in %): ");
        rate = sc.nextDouble()/100;

        System.out.println("enter the number of times compounded per year: ");
        timesCompounded = sc.nextInt();

        System.out.println("enter the number of years: ");
        years = sc.nextInt();

        amount = principal * Math.pow(1 + (rate / timesCompounded), timesCompounded * years);

        System.out.printf("the amount after %d years is ₹%.2f \n",years,amount);
        sc.close();
    }
}
