import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = sc.nextInt();

        // Bonus calculation
        if (yearsOfService > 5) {
            double bonus = salary * 0.05; // 5% bonus
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus awarded (less than or equal to 5 years of service).");
        }

        sc.close();
    }
}