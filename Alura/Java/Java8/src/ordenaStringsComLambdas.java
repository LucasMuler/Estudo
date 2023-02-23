import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ordenaStringsComLambdas {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("aula online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		Collections.sort(palavras);
		System.out.println(palavras);

		/**
		 * o metodo sort recebe um comparator, que define qual será a ordem da minha
		 * lista, neste caso é por tamanho
		 * aplicando o lambda, apenas retiramos a informação que o mesmo é uma classe e que ela implementa um Comparator
		 */
		palavras.sort((String s1, String s2) -> {
				return s1.length() - s2.length();
		});

		System.out.println(palavras);

		/**
		 * o metodo forEach utiliza um consumidor, o mesmo é uma interface que implementa apenas um metodo, por
		 * isso podemos aplicar o conceito de classes anonimas, seria a mesma coisa que escrever um foreach
		 * aplicando o lambda, apenas retiramos a informação que o mesmo é uma classe e que ela implementa um consumer
		 */
		
		Consumer<String> consumer =(String s) -> {
				System.out.println(s);
		};

		palavras.forEach(consumer);

	}

}
