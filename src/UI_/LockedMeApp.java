package UI_;
import java.lang.reflect.Method;
import java.util.Scanner;
import FileHandling.FileHandler;
public class LockedMeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Developed by Anris Roque Da Costa");
		int attempts = 0;
		int maxAttempts = 5;
		
		
		while (attempts < maxAttempts) {
			System.out.println("\n Choose an Option:");
			System.out.println("1. List files in asceding order");
			System.out.println("2. Add file");
			System.out.println("3. delete file");
			System.out.println("4. Search a file");
			System.out.println("5. Exit Application");
			System.out.println("Enter your choice: ");
			
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    FileHandler.listFiles();
                    break;

                case 2:
                    System.out.print("Enter the filename to add: ");
                    String addFile = sc.nextLine();
                    FileHandler.addFile(addFile);
                    break;

                case 3:
                    System.out.print("Enter the filename to delete: ");
                    String deleteFile = sc.nextLine();
                    FileHandler.deleteFile(deleteFile);
                    break;

                case 4:
                    System.out.print("Enter the filename to search: ");
                    String searchFile = sc.nextLine();
                    FileHandler.search_file_data(searchFile);
                    break;

                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);

                default:
                    attempts++;
                    System.out.println("Invalid option. Please try again.");
                    if (attempts == maxAttempts) {
                        System.out.println("Maximum attempts reached. Exiting the application.");
                        System.exit(0);
                    }
                    break;
            }
        }
    }
}
