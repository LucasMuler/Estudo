package ExercicioPedidoComposto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import ExercicioPedidoComposto.Entities.Client;
import ExercicioPedidoComposto.Entities.Order;
import ExercicioPedidoComposto.Entities.OrderItem;
import ExercicioPedidoComposto.Entities.OrderStatus;
import ExercicioPedidoComposto.Entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data");
		System.out.println("Name:");
		String nome = sc.nextLine();
		System.out.println("Email:");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY)");
		String date = sc.nextLine();
		Date datef = sdf.parse(date);
		
		Client c = new Client(nome, email, datef);
		
		
		System.out.println("Enter order data:");
		System.out.println("Status:");
		String orderStatus = sc.nextLine();
		System.out.println("How many items to this order?");
		int quantidadeItens = sc.nextInt();
		sc.nextLine();
		
		Order order = new Order(OrderStatus.valueOf(orderStatus), c);
		
		for (int i = 0; i < quantidadeItens;i++) {
			System.out.println("Enter #" + (i+1) + "item data:");
			System.out.println("Product name: ");
			String product = sc.nextLine();
			System.out.println("Produtc price");
			double price = sc.nextDouble();
			sc.nextLine();
			
			Product p = new Product(product, price);
			
			System.out.println("Quantity:");
			int quantity = sc.nextInt();
			sc.nextLine();
			
			OrderItem orderItem = new OrderItem(quantity, p);
			order.addItem(orderItem);
			
		}
		
		System.out.println(order);
		
		sc.close();
	}

}
