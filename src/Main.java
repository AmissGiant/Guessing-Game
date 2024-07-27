import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean win = false;
        while(!win) {
            Random random = new Random();
            int rand = 0;
            do {
                rand = random.nextInt(11);
            } while (rand == 0);

            Scanner in = new Scanner(System.in);
            System.out.println("please enter your guess");
            int guess = Integer.parseInt(in.nextLine());

            if (guess == rand) {
                System.out.println("Great job you win!");
                win = true;
            } else {
                System.out.println("You lose;");
            }
        }
    }
}