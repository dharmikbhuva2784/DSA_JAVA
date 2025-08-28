public class variables {
    public static void main(String[] args) {
        int age; //declaration
        int year = 2025;
        int quantity = 1;
        age = 21; //assignment

        System.out.println(age); //print
        System.out.println(year);
        System.out.println(quantity);

        System.out.println("the year is "+year);

        //double

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("$"+price);

        //character

        char grade = 'A';
        char symbol = 'l';
        char currency = '$';

        System.out.println(grade);

        //boolean

        boolean isStudent = false;
        boolean isOnline = true;
        boolean forSale = false;

        System.out.println(isOnline);

        if (isStudent) {
            System.out.println("you're a student!");
        }else{
            System.out.println("you're not a student!");
        }

        //string

        String name = "Dharmik B.";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "bmw m2 g87";
        String color = "black";

        System.out.println("hello "+name);
        System.out.println("you are "+age+" years old");
        System.out.println("your gpa is "+gpa);
        System.out.println("your average letter grade is "+grade);

        System.out.println("your choice is a "+color+" "+year+" "+car);

        System.out.println("the price is : "+currency+price);

        if (forSale) {
            System.out.println("there is a "+car+" for sale");
        }else{
            System.out.println("the "+car+" is not for sale");
        }

        System.out.println("your favourite food is "+food);
        System.out.println("ypur email is "+email);

    }
}


/*
 * int = 420
 * double = 3.14
 * 
 * var = reusable containers
 * 
 * 
 * primitive = directly stored in stack memory
 * ex. int, double, char, boolean
 * 
 * reference = memory address in stack that point to the heap
 * ex. string, array, object
 * 
 * 
 * 2 steps to create a variable
 * 
 * 1. declaration
 * 2. assignment
 * 
 */