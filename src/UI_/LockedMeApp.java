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
			System.out.println("2. Manage file (Add, Delete, Search");
			System.out.println("3. Close application");
			System.out.println("4. Search a file");
			System.out.println("Enter your choice: ");
			
			
			int choice_is_yours = sc.nextInt();
			
			if (choice_is_yours == 1) {
				FileHandling.FileHandler.listFiles();
			}
			else if (choice_is_yours == 2) {
				System.out.println("Enter the filename to be added:");
				String filenam = sc.next();
				FileHandling.FileHandler.addFile(filenam);
			}
			else if (choice_is_yours==3) {
				System.out.println(" Enter the filename to be deleted");
				String filenam = sc.next();
				FileHandling.FileHandler.deleteFile(filenam);
				
			}
			else if ( choice_is_yours == 4) {
				System.out.println(" Enter the filename to be searched:");
				String filenam = sc.next();
				FileHandling.FileHandler.search_file_data(filenam);
			}
			else {
				attempts++;
				
				System.out.println("Invalid Option. Existing the application ");
				if (attempts == maxAttempts) {
					System.out.println("Maximum attempts reached, there by existing application");
					System.exit(0);
				}
				
			}
			
		}
	}

}
