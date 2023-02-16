package CadastroUsuarioComPolimorfismo.Entities;

public final class OutsourcedEmployee extends Employee{

	private double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, int hours, double valuePerHuor, double additionalCharge) {
		super(name, hours, valuePerHuor);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public final double payment() {
		return (valuePerHuor * hours) + (additionalCharge * 1.1);
	}
	
	
}
