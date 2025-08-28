public class mathClass {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 5); //finds the power of the number
        System.out.println(result);

        result = Math.abs(-5);
        //returns the absolute value of number e.g. non-negative
        System.out.println(result);

        result = Math.sqrt(25); //finds the sqrt of the number
        System.out.println(result);

        result = Math.round(3.74);
        //rounds the value to next int if fraction is greater than 0.5
        //rounds down value to previous int if frac. is lower than 0.5
        System.out.println(result);

        result = Math.ceil(3.14); // round up the value
        System.out.println(result);

        result = Math.floor(3.14); // round down the value
        System.out.println(result);

        result = Math.max(10, 20); //find max from entered numbers
        System.out.println(result);

        result = Math.min(10, 20); //find min from entered numbers
        System.out.println(result);
    }
}
