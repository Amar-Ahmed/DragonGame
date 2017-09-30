import java.util.*;


public class DragonGame {

    public static void main(String[] args) throws InterruptedException {
        int hitpoint=5;
        int x=0;
        System.out.println("Welcome to Amar's Kingdom");
        System.out.println("You have been called to service by the king to slay the dragon");
        System.out.println("If you are ready to be a hero type 0 else type 1 to quit");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case 0:
                System.out.println("Get your armour and sword ready\nThen go to the Dark forest...\nThe dragon awaits there");
                break;
            case 1:
                System.out.println("You are NOT ready for this challenge");
                System.exit(0);

                default:
                    System.out.println("You are NOT ready for this challenge");
                    System.exit(0);

        }
        System.out.println("Look carefully for the dragon .....");
        Thread.sleep(2000);

        System.out.println("Woosh, The dragon is here, it has 5 Hitpoints");
        System.out.println("Type hit to reduce the dragons hit point\nor type run to evade the dragon");
        Scanner scannerInput = new Scanner(System.in);

        while (x< 2){
            String input = scannerInput.next();
            if (input.equals("hit")) {

                hitpoint=hitpoint-5;
                x++;
                System.out.println("Congrats you defeated the dragon");
                System.out.println("You are the hero");



            }else {
                System.out.println("You ran\nWhat would you like to do next");
            }
        }

        for (int i = 0; i < (hitpoint-x); i++) {
            System.out.println("You defeated the dragon in "+(hitpoint-x));
        }





    }
}




