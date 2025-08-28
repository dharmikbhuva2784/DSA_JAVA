public class printfStatement {
    public static void main(String[] args) {
        // printf() is a alternative to print() and println()

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s \n", name);
        System.out.printf("your name starts with a %c \n",firstLetter);
        System.out.printf("You are %d years old \n",age);
        System.out.printf("You are %.1f inches tall",height);
        System.out.printf("Employed: %b \n",isEmployed);

        System.out.printf("%s is %d years old \n",name,age);

        // printf() = is a method used to format output

        // %[flags]|width][ precision] [specifier-character]

        // [flags]

        // + = output a plus
        // , = comma grouping separator
        // (= negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 99999.99;
        double price2 = 100400.15;
        double price3 = -5400.01;

        System.out.printf("%.2f\n",price1);
        System.out.printf("%.2f\n",price2);
        System.out.printf("%.2f\n",price3);

        System.out.println("__________________________________________________");


        System.out.printf("%+.2f\n",price1);
        System.out.printf("%+.2f\n",price2);
        System.out.printf("%+.2f\n",price3);

        System.out.println("__________________________________________________");


        System.out.printf("%,.2f\n",price1);
        System.out.printf("%,.2f\n",price2);
        System.out.printf("%,.2f\n",price3);

        System.out.println("__________________________________________________");

        System.out.printf("%(.2f\n",price1);
        System.out.printf("%(.2f\n",price2);
        System.out.printf("%(.2f\n",price3);

        System.out.println("__________________________________________________");

        System.out.printf("% .2f\n",price1);
        System.out.printf("% .2f\n",price2);
        System.out.printf("% .2f\n",price3);

        

    }
}
