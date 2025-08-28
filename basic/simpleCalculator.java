import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char choice;
        double result;

        System.out.println("Simple Calculator program");

        System.out.print("enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("enter the second number: ");
        num2 = sc.nextDouble();

        System.out.println("-------------------------");
        System.out.print("+ addition\n- subtraciton\n* multiplication\n/ division \n% modulus\n^ power\nEnter the symbol of the operation you want to perform: ");
        choice = sc.next().charAt(0);

        switch (choice) {
            case '+':
                result = num1 + num2;
                System.out.println("addition: "+result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("subtraction: "+result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("multipilcation: "+result);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("A number cannot be divided with 0!");break;
                }else{
                    result = num1 / num2;
                    System.out.println("division: "+result);
                    break;
                }

            case '%':
                result = num1 / num2;
                System.out.println("modulus: "+result);
                break;

            case '^':
                result = Math.pow(num1, num2);
                System.out.println(num1+" to the power "+num2+": "+result);
                break;
        
            default:
                System.out.println("Invalid operator!");
                break;
        }

        sc.close();
    }
}
