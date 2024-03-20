import java.util.Scanner;

public class ARNavigationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Augmented Reality Navigation App!");
        System.out.println("Please select an option:");
        System.out.println("1. View AR Map");
        System.out.println("2. Get Directions");
        System.out.println("3. Exit");
        
        int option = scanner.nextInt();
        
        switch (option) {
            case 1:
                viewARMap();
                break;
            case 2:
                getDirections();
                break;
            case 3:
                System.out.println("Exiting the app...");
                break;
            default:
                System.out.println("Invalid option. Please select a valid option.");
                break;
        }
        
        scanner.close();
    }
    
    public static void viewARMap() {
        // Code to display AR map using AR library
        System.out.println("Displaying Augmented Reality Map...");
    }
    
    public static void getDirections() {
        // Code to get directions using GPS and map services
        System.out.println("Getting directions...");
    }
}
