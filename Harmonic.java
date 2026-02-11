import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number (n): ");

        double number = input.nextDouble();

        double sum = 0;

        for(double i = 1; i<=number; i++){
            sum+=1/i;
        }
          System.out.println("Harmonic number H_" + number + " = " + sum);

        input.close();
    }
}