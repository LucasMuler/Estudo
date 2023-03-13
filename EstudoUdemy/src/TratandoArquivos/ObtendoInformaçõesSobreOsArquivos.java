package TratandoArquivos;

import java.io.File;
import java.util.Scanner;

public class ObtendoInformaçõesSobreOsArquivos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("get name: " + path.getName());
		System.out.println("get Parent: " + path.getParent());
		System.out.println("get Path: " + path.getPath());
		
		sc.close();
	}
}
