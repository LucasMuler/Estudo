package MenbrosEstaticos.Util;

public class Calculator {

	public static final double PI = 3.14159;
	
	public static double getCircuference(double radius) {
		return 2 * PI * radius;
	}

	public static double getVolume(double radius) {
		return 4 * PI * radius * radius * radius / 3;
	}
	
}
