public class logicalOperators {
    public static void main(String[] args) {

        // && - and
        double temp = 20;
        boolean isSunny = true;
        if (temp >= 0 && temp <= 30 && isSunny) {
            System.out.println("the weather is good");
            System.out.println("it is sunny outside");
        }

        // ! - not
        boolean isDrunk = true;
        if (!isDrunk) {
            System.out.println("The passenger is not drunk and driving");
        }else{
            System.out.println("The passenger is drunk and driving!");
        }

        // || - or
        boolean haveOnlineTicket = false;
        boolean haveOfflineTicket = true;

        if (haveOfflineTicket || haveOnlineTicket) {
            System.out.println("You're allowed to enter into karan aujla's concert\nEnjoy! 😎");
        }else{
            System.out.println("Sorry, you're not allowed to enter into karan aujla's concert\nBetter luck next time 😉");
        }

    }
}
