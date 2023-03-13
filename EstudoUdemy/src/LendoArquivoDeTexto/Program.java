package LendoArquivoDeTexto;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("c:\\temp\\in.txt"); //Cria um novo arquivo a apartir de um ja existente na maquina
		Scanner sc = null;
		try {

			sc = new Scanner(file); // instancia o Scanner para ler o arquivo 
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine()); // printa as proximas linhas
			}

		} catch (IOException e) { // Exception mais comum de leitura de arquivos

			System.out.println("Error: " + e.getMessage());

		} finally {
			if (sc != null) {
				sc.close();
			}

		}
	}
}
