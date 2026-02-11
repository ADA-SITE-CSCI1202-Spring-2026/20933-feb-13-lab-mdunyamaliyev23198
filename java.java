import java.util.Scanner;

public class java{
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number: ");
        int num1 = input.nextInt();

        System.out.println("here: " + num1);

        input.close();

    }
}