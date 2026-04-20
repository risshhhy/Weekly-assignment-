import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check Gregorian calendar validity
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582 (Gregorian calendar).");
        } else {
            // Multiple if-else approach
            if (year % 400 == 0) {
                System.out.println("Year " + year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println("Year " + year + " is not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println("Year " + year + " is a Leap Year.");
            } else {
                System.out.println("Year " + year + " is not a Leap Year.");
            }
        }

        sc.close();
    }
}