import java.util.Scanner;

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Resume Builder");

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your educational qualification: ");
        String education = scanner.nextLine();

        System.out.print("Enter your work experience: ");
        String experience = scanner.nextLine();

        System.out.println("\n----- Resume -----\n");
        System.out.println("Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Education: " + education);
        System.out.println("Experience: " + experience);

        scanner.close();
    }
}
