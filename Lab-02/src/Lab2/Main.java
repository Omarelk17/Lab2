package Lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their name and age
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        // Create an instance of User
        User user = new User(name, age);

        // Display user info without hobby
        user.displayInfo();

        // Prompt user for their hobby
        System.out.print("Enter your hobby: ");
        String hobby = scanner.nextLine();

        // Display user info with hobby
        user.displayInfo(hobby);

        // Calculate years until retirement
        int retirementAge = 65;
        int yearsUntilRetirement = retirementAge - age;

        // Display years until retirement
        user.displayInfo(yearsUntilRetirement);

        // Close the scanner
        scanner.close();
    }
}
