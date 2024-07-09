import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineReservationSystem {
    private static Map<String, String> credentials;
    private static Map<String, String> reservations;

    static {
        credentials = new HashMap<>();
        credentials.put("user1", "password1");
        credentials.put("user2", "password2");
        credentials.put("user3", "password3");

        reservations = new HashMap<>();
        reservations.put("PNR123", "User1: Train1, 1st Class, 12/06/2024, A to B");
        reservations.put("PNR456", "User2: Train2, 2nd Class, 15/06/2024, C to D");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Online Reservation System");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Login successful!");

            while (true) {
                System.out.println("\nMain Menu:");
                System.out.println("1. Make a Reservation");
                System.out.println("2. Cancel Reservation");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        makeReservation(scanner);
                        break;
                    case 2:
                        cancelReservation(scanner);
                        break;
                    case 3:
                        System.out.println("Thank you for using Online Reservation System. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        } else {
            System.out.println("Invalid username or password. Login failed.");
        }

        scanner.close();
    }

    private static boolean authenticate(String username, String password) {
        return credentials.containsKey(username) && credentials.get(username).equals(password);
    }

    private static void makeReservation(Scanner scanner) {
        System.out.println("\nReservation System");
        System.out.println("Please fill out the following details:");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter train number: ");
        String trainNumber = scanner.nextLine();

        String trainName = fetchTrainName(trainNumber);

        System.out.print("Enter class type: ");
        String classType = scanner.nextLine();

        System.out.print("Enter date of journey (DD/MM/YYYY): ");
        String dateOfJourney = scanner.nextLine();

        System.out.print("Enter journey from (place): ");
        String fromPlace = scanner.nextLine();

        System.out.print("Enter journey to (destination): ");
        String toDestination = scanner.nextLine();

        String reservationDetails = name + ": " + trainName + ", " + classType + ", " + dateOfJourney + ", " + fromPlace + " to " + toDestination;
        String pnr = generatePNR();
        reservations.put(pnr, reservationDetails);

        System.out.println("\nReservation successful!");
        System.out.println("PNR Number: " + pnr);
        System.out.println("Details:");
        System.out.println(reservationDetails);
    }

    private static void cancelReservation(Scanner scanner) {
        System.out.println("\nCancellation System");
        System.out.print("Enter PNR number for cancellation: ");
        String pnr = scanner.nextLine();

        if (reservations.containsKey(pnr)) {
            String details = reservations.get(pnr);
            System.out.println("Details for PNR " + pnr + ":");
            System.out.println(details);
            System.out.print("Press OK to confirm cancellation (yes/no): ");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("yes")) {
                reservations.remove(pnr);
                System.out.println("Reservation with PNR " + pnr + " has been cancelled.");
            } else {
                System.out.println("Cancellation aborted.");
            }
        } else {
            System.out.println("No reservation found with PNR " + pnr);
        }
    }

    private static String fetchTrainName(String trainNumber) {
        return "Sample Train Name";
    }

    private static String generatePNR() {
        return "PNR" + (reservations.size() + 1);
    }
}