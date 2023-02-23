
public class ExecicioElementosAdjacentes {

	public static void main(String[] args) {
		int[] inputArray = { 3, 6, -2, -5, 7, 3 };
		int maiorNumero = 0;

		for (int i = 0; i < inputArray.length; i++) {

			int arrayAnterior = i - 1;
			int arraySucessor = i + 1;
			int numero = 0;

			if (i == 0) {
				numero = inputArray[i] * inputArray[arraySucessor];

				if (numero > maiorNumero) {

					maiorNumero = numero;

				}
			}

			else {

				if (i == inputArray.length - 1) {
					numero = inputArray[i] * inputArray[arraySucessor];

					if (numero > maiorNumero) {

						maiorNumero = numero;

					}
				}

				numero = inputArray[i] * inputArray[arraySucessor];

				if (numero > maiorNumero) {

					maiorNumero = numero;
				}

				numero = inputArray[i] * inputArray[arrayAnterior];

				if (numero > maiorNumero) {

					maiorNumero = numero;

				}

			}

		}

		System.out.println(maiorNumero);
	}

}
