public class arithmetic {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int z;

        //addtion
        z = x + y;
        System.out.println(z);

        //sub
        z = x - y;
        System.out.println(z);

        //multi
        z = x * y;
        System.out.println(z);

        //divide
        z = x / y;
        System.out.println(z);

        //modulus
        z = x % y;
        System.out.println(z);

        x += y; //x=x+y
        System.out.println(x);

        x -= y; //x =x-y
        System.out.println(x);

        x *= y; // x = x * y
        System.out.println(x);

        x /= y; // x = x / y
        System.out.println(x);

        x %= y; //x = x % y
        System.out.println(x);

        //-------------------------

        x = 1;
        x++;
        System.out.println("incremental operator "+x);

        x = 1;
        x--;
        System.out.println("decrement operator "+x);

        double result = 3 + 4 * (7 - 5) / 2.0;
        /* order of operation - p-e-m-d-a-s
        1. parenthisis
        2. exponents
        3. multiplication
        4. division
        5. addition
        6. subtraction
        */ 

        
        System.out.println(result);
    }
}
