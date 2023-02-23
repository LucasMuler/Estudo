package CadastroUsuarioComPolimorfismo.Entities;

public class Employee {

	private String name;
	protected int hours;
	protected double valuePerHuor;
	
	public Employee() {
	}

	public Employee(String name, int hours, double valuePerHuor) {
		this.name = name;
		this.hours = hours;
		this.valuePerHuor = valuePerHuor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getValuePerHuor() {
		return valuePerHuor;
	}

	public void setValuePerHuor(double valuePerHuor) {
		this.valuePerHuor = valuePerHuor;
	}
	
	public double payment() {
		return valuePerHuor * hours;
	}
	
}
