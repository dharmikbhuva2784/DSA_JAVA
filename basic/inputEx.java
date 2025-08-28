import java.util.Scanner;

public class inputEx {
    public static void main(String[] args) {
        double width= 0;
        double height= 0;
        double area =0;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the width;");
        width = sc.nextDouble();

        System.out.println("enter the height:");
        height = sc.nextDouble();

        area = height * width;

        System.out.println("the area is "+area+" cm²");

        sc.close();
    }
}
