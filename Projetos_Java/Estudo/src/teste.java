
public class teste {

	public static void main(String[] args) {

		int[] inputArray = { 3, 6, 5, -5, 7, 3 };
		
		int produto = inputArray[0] * inputArray[1];
		
		for (int i = 1; i < inputArray.length - 1; i++) {
			int n1 = inputArray[i] * inputArray[i+1];
			if (n1 > produto) {
				produto = n1;
			}
		}
		
		System.out.println("oi");
		System.out.print("io");

	}

}

