import java.util.Random;

public class randomClass {
    public static void main(String[] args) {
        Random rd = new Random();

        int number;

        number = rd.nextInt(1,7);
        //it will be between -2 billion to +2 billion by default if we don't add the limit
        System.out.println(number);

        double num1 = rd.nextDouble();
        System.out.println(num1);

        boolean isHeads = rd.nextBoolean();
        if (isHeads) {
            System.out.println("heads");
        }else{
            System.out.println("tails");
        }

        
    }   
}