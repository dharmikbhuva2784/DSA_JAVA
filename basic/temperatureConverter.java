import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature;
        double newTemperature;

        System.out.println("Temperature conversion program");
        System.out.println("1. convert from celsius to fahrenheit");
        System.out.println("2. convert from fahrenheit to celsius");
        System.out.print("enter your choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("enter the temperature in celsius: ");
            temperature = sc.nextDouble();

            newTemperature = (temperature * 1.8) + 32;
            System.out.println("temperature in fahrenheit: "+newTemperature+" °F");
        }else if (choice == 2) {
            System.out.println("enter the temperature in fahrenheit: ");
            temperature = sc.nextDouble();

            newTemperature = (temperature - 32) * 5/9;
            System.out.println("temperature in celsius: "+newTemperature+" °C");
        }else{
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
