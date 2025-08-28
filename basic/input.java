import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();


        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("what is your gpa : ");
        double gpa = sc.nextDouble();

        System.out.println("are you a student? (true/false)");
        boolean isStudent = sc.nextBoolean();

        System.out.println("hello "+name+"!");
        System.out.println("you are "+age+" years old");
        System.out.println("your gpa is "+gpa);
        if (isStudent) {
            System.out.println("you're enrolled as a student");
        }else{
            System.out.println("you're not enrolled");
        }

        // String name = sc.next();
        //this method reads the user input till a space comes
        //it will ignore all the substring after the space

        sc.close();
    }   
}