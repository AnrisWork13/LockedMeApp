package FileHandling;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
public class FileHandler {
	public static void listFiles() {
		File Dir = new File("./"); // considering that this is the current directory of the file 
		
		File[] files = Dir.listFiles();
		
		if (files != null && files.length >0) {
			Arrays.sort(files);
			System.out.println("Files in ascending order:");
			for (File file: files) {
				if (file.isFile()){
					System.out.println(file.getName());
				}
				
			}
			
		}else {
			System.out.println(" No files found ");
		}
			
		}
	
	public static void addFile(String filename) {
		File newFile_data = new File(filename);
		try {
			if (newFile_data.createNewFile()) {
				System.out.println("File Created :" + newFile_data.getName());
				
			}
			else {
				System.out.println(" File already exist");
			}
		}
		catch (IOException e) {
			System.out.println(" May be some error ouccured while creating the file");
			e.printStackTrace();
		}
		
	}
	public static void deleteFile(String filename) {
		File delFile_data = new File(filename);
		if (delFile_data.delete()) {
			System.out.println(" File needed to be deleted: " + delFile_data.getName());
			
		}
		else {
			System.out.println(" File cannot be deleted ");
		}
	}
	public static void search_file_data(String filename) {
		File dirs = new File("./");
		File[] files = dirs.listFiles();
		boolean found_file = false;
		for (File file : files) {
			if (file.getName().equals(filename)) {
				System.out.println("File found" + file.getName());
				found_file = true;
				break;
			}
		}
		if (!found_file) {
			System.out.println("File not found");
		}
	}

}
