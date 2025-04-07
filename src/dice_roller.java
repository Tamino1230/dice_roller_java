import java.util.Random;

public class dice_roller {
    public static void main(String[] args) {
        // Rolling dice simulator
        roll_dice(5);
    }

    public static void roll_dice(int times) {
        for (int i=0; i<times; i++) {
            int randint = random_number_return();
            printout_number(randint);
        }
        System.out.println("\nYou Rolled the dice " + times + " times");
    }

    public static int random_number_return() {
        Random r = new Random();
        int randint = r.nextInt(6);
        return (randint + 1); // +1 because i want 1-6
    }

    public static void printout_number(int randint) {
        System.out.println("A " + randint + " got rolled!");
    }
}
