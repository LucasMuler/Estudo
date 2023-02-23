package TransporteProdutosPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import TransporteProdutosPolimorfismo.Entities.ImportedProduct;
import TransporteProdutosPolimorfismo.Entities.Product;
import TransporteProdutosPolimorfismo.Entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		List<Product> listaDeProdutos = new ArrayList<>();
		System.out.println("Enter the number of products: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numero; i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.println("Common, used or imported (C/U/i)?");
			char option = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			
			if (option == 'i') {
				
				System.out.println("Customs fee: ");
				double cusfee = sc.nextDouble();
				
				Product p = new ImportedProduct(name,price,cusfee);
				listaDeProdutos.add(p);
				
			} else if (option == 'c') {
				
				Product p = new Product(name,price);
				listaDeProdutos.add(p);
				
			} else if (option == 'u') {
				
				SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
				System.out.println("Manufacture fate (DD/MM/YYYY)");
				String manudate = sc.nextLine();
				Date date = sdf.parse(manudate);
				
				Product p = new UsedProduct(name,price,date);
				listaDeProdutos.add(p);
				
			}
			
		}
		
		System.out.println("Price TAGS");
		
		for (Product product : listaDeProdutos) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
	
}