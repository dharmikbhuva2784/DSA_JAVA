import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;




        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.println("the circumference of the circle is :"+circumference+"cm");

        area = Math.PI * Math.pow(radius, 2);
        System.out.println("the area of the circle is :"+area+"cm²");

        volume = (4/3) * Math.PI * Math.pow(radius,3);
        System.out.println("the volume of the sphere is :"+volume+"cm³");

        //to limit diplaying the numbers after fraction
        //use printf

        System.out.println("__________________________________________________");
        System.out.printf("circumference: %.1fcm\n",circumference);
        System.out.printf("area: %.1fcm²\n",area);
        System.out.printf("volume: %.1fcm³\n",volume);


        sc.close();
    }
}
