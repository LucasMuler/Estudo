package TransporteProdutosPolimorfismo.Entities;

public final class ImportedProduct extends Product{

	private double customsFee;

	public ImportedProduct() {
	}
	
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

	
	public double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " + (price+customsFee) + "(Customs fee: $ " + customsFee + ")";
	}
}
