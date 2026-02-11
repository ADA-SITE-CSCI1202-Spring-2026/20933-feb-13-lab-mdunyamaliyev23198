import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");

        double number = input.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");

        } else {
        System.out.println("Neutral (0)");
        }

        
    }
}