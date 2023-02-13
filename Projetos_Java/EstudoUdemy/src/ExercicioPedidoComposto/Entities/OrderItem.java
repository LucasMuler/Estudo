package ExercicioPedidoComposto.Entities;

public class OrderItem {
	
	private Product product;
	private int quantity;
	private double price;
	
	public OrderItem() {
	}

	public OrderItem(int quantity, Product product) {
		this.product = product;
		this.quantity = quantity;

		this.price = product.getPrice() * quantity; 
	}

	public Product getProdutct() {
		return this.product;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double subTotal() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderItem [quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
