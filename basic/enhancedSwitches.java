import java.util.Scanner;

public class enhancedSwitches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your day, based on that, we will ssend you some message");
        String day = sc.nextLine();

        switch (day) {
            case "Monday":
                System.out.println("Oh! have some great energy on first weekday");
                break;
            
            case "Tuesday":
                System.out.println("tuesday! i love tuesdays!");
                break;
            
            case "Wednesday":
                System.out.println("It already mid of the weekdays, keep going 😎");
                break;
            
            case "Thursday":
                System.out.println("It's thoroughly thursday");
                break;

            case "Friday":
                System.out.println("Hurray, it's the last day of the weekdays 🥳");
                break;
            
            case "Saturday":
                System.out.println("Weekends! party, chill and movies, that's it!");
                break;

            case "Sunday":
                System.out.println("Last day of weekend 😔, but don't forget to enjoy it without thinking about tomorrow! 🤩");
                break;

            default:
                System.out.println("You're maybe from another dimension 👽, sorry, this day doesn't exists!");
                break;
        }

        sc.close();
    }
}
