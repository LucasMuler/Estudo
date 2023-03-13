package TratandoArquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		/**
		 * List all the pastes
		 */
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		/**
		 * List all files
		 */
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("File: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		/**
		 * Creates a new Paste on the current directory
		 */
		
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println(sucess);
		
		sc.close();
	}

}
