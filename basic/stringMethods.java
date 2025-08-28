import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {
        String name = "Bro Code";

        int length = name.length();
        System.out.println("the length of "+name+" is "+length);

        char letter = name.charAt(0);
        System.out.println("the letter at index "+(name.indexOf(letter)+1)+ " is "+letter);

        int index = name.indexOf(" ");
        System.out.println(index);

        int lastIndex = name.lastIndexOf("o");
        System.out.println(lastIndex);

        String uppercaseString = name.toUpperCase();
        System.out.println(uppercaseString);

        String lowercaseString = name.toLowerCase();
        System.out.println(lowercaseString);


        String replaceName = name.replace("o", "a");
        System.out.println(replaceName);

        boolean isEmpty = name.isEmpty();
        System.out.println(isEmpty);

        if (name.isEmpty()) {
            System.out.println("your name is empty");
        }else{
            System.out.println("your name is "+name);
        }

        boolean containsChar = name.contains("code");
        System.out.println(containsChar);

        if (name.contains("")) {
            System.out.println("your name contains space/s");
        }else{
            System.out.println("your name doesn't contain space/s");
        }

        if (name.equalsIgnoreCase("bro code")) {
            System.out.println("string matches with target string :)");
        }else{
            System.out.println("string does not matches with target string");
        }

        
    }
}
