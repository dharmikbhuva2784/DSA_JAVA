import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        double weight;
        double convertedWeight;
        int choices;

        System.out.println("weight conversion program");
        System.out.println("1. convert lbs to kgs");
        System.out.println("2. conert kgs to lbs");
        System.out.println("choose an option");
        choices = sc.nextInt();

        if (choices == 1) {
            System.out.print("enter your weight in lbs (pounds): ");
            weight = sc.nextDouble();
            convertedWeight = weight * 0.453592;
            System.out.println("ypur weight in kgs (kilograms): "+convertedWeight);
        } else if (choices == 2) {
            System.out.print("enter your weight in kgs (kilograms): ");
            weight = sc.nextDouble();
            convertedWeight = weight * 2.20462;
            System.out.println("your weight in lbs (pounds): "+convertedWeight);
        } else{
            System.out.println("Invalid choice, please try again!");
        }

        sc.close();
    }
}
