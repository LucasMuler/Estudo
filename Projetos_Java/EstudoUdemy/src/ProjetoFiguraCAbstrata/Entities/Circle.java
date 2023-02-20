package ProjetoFiguraCAbstrata.Entities;

public final class Circle extends Shape{

	private double radius;
	
	public Circle() {
	}

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return (Math.pow(radius, 2) * Math.PI);
	}

	
	
}
