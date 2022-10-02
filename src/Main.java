import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args) {
        int playersChoice;

        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;

        System.out.println("Pick a number between 1-10:");
        if(in.hasNextInt())
        {
            playersChoice = in.nextInt();
            System.out.println("The computer chose: " + val + ". You chose: " + playersChoice + ".");
            if (val == playersChoice)
                System.out.println("You're right on the money!");
            else if (val > playersChoice)
                System.out.println("Should have gone Higher!");
            else if (playersChoice > val)
                System.out.println("Should have gone Lower!");
        }
        else {
            System.out.println("Bad input");
            System.exit(0);
        }
    }
}