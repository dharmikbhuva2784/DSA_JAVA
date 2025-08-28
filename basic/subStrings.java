import java.util.Scanner;

public class subStrings {
    public static void main(String[] args) {
        // email slicer program

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your email: ");
        String email = sc.nextLine();

        if (email.contains("@")) {
            String name = email.substring(0,email.indexOf("@"));
        System.out.println(name);

        String emailDomain = email.substring(email.indexOf("@")+1,email.indexOf(
            "."
        ));

        System.out.println(emailDomain);

        String topLevelDomain = email.substring(email.indexOf(".")+1);
        System.out.println(topLevelDomain);
        }else{
            System.out.println("Invalid format of the email!");
        }

    }
}
