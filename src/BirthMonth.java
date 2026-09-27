import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        // Create a Scanner to get input from the user.
        // Ask the user to enter their birth month.
        // Safely check that the input is a valid integer.
        // If the month is between 1 and 12 inclusive, echo the month.
        // Otherwise, display an incorrect month error message.
        // If the input is invalid, display an error message.

        Scanner in = new Scanner(System.in);
        int month = 0;
        String trash = "";

        System.out.print("Enter your birth month (1-12): ");

        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine();

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }

        in.close();
    }
}
