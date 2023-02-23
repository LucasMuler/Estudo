package ExercicioPedidoComposto.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private Date moment;
	private OrderStatus status;
	private Client client;
	
	List<OrderItem> listaDeProdutos = new ArrayList<>();
	
	public Order() {
	}

	public Order(OrderStatus status, Client client) {
		this.moment = new Date();
		this.client = client;
		this.status = status;
	}
	
	public void addItem(OrderItem orderItem) {
		listaDeProdutos.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem) {
		listaDeProdutos.remove(orderItem);
	}
	
	public double total() {
		double som = 0;
		for (OrderItem orderItem : listaDeProdutos) {
			som += orderItem.subTotal();
		}
		return som;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY \n");
		sb.append("Order moment: " + this.moment + "\n");
		sb.append("Order status " + this.status + "\n");

		sb.append("Client: " + this.client.getName() + " ("+ this.client.getBirthdate() + ") - " + this.client.getEmail() + "\n");
		
		sb.append("Order items: \n");
		
		for (OrderItem orderItem : listaDeProdutos) {
			sb.append(orderItem.getProdutct().getName() + ", " + 
					orderItem.getProdutct().getPrice() + ", " + orderItem.getQuantity() + ", "
					+ "Subtotal: $" +orderItem.subTotal() + "\n");
		}
		
		System.out.print("Total price: $");
		double sum = 0;
		
		for (OrderItem orderItem : listaDeProdutos) {
			sum += orderItem.subTotal();
		}
		
		sb.append("Total price: $" + sum);
		
		return sb.toString();
	}
	
	
	
}
