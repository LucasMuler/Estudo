package ProjetoFiguraCAbstrata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ProjetoFiguraCAbstrata.Entities.Circle;
import ProjetoFiguraCAbstrata.Entities.Color;
import ProjetoFiguraCAbstrata.Entities.Rectangle;
import ProjetoFiguraCAbstrata.Entities.Shape;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Shape> listaFormas = new ArrayList<>();
		
		System.out.println("Enter the number of shapes");	
		int numberOfShapes = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numberOfShapes; i++) {
			System.out.println("Shape #" + (i+1) + " data: ");
			System.out.println("Rectangle of circle (r/c)? ");
			
			char choice = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.println("Color (BLACK/BLUE/RED): ");
			String color = sc.nextLine();
			
			if (choice == 'r') {
			
				System.out.println("Width: ");
				double width = sc.nextDouble();
				sc.nextLine();
				System.out.println("Height: ");
				double height = sc.nextDouble();
				sc.nextLine();
		
				Shape s = new Rectangle(Color.valueOf(color), width, height);
				listaFormas.add(s);
				
			} else if(choice == 'c') {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				sc.nextLine();
				
				Shape s = new Circle(Color.valueOf(color), radius);
				listaFormas.add(s);
			}
		}
		
		
		System.out.println();
		System.out.println("Shaped Areas");
		for (Shape shape : listaFormas) {
			System.out.printf("%.2f%n", shape.area());
		}
		
		sc.close();
	}
	
}
