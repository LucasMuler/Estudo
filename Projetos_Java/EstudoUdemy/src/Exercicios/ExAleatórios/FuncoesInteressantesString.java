package Exercicios.ExAleatórios;

public class FuncoesInteressantesString {

	public static void main(String[] args) {
	
		String original = "abcde FGHIJ ABC abc DEFG      ";
		
		String s01 = original.toLowerCase();
		System.out.println(s01);
		
		String s02 = original.toUpperCase();
		System.out.println(s02);
		
		String s03 = original.trim();
		System.out.println(s03);

		String s04 = original.substring(2);
		System.out.println(s04);
		
		String s05 = original.substring(2, 9);
		System.out.println(s05);
		
		String s06 = original.replace('a', 'x');
		System.out.println(s06);
		
		String s07 = original.replace("abc", "xy");
		System.out.println(s07);
		
		int i = original.indexOf("bc");
		System.out.println(i);
		
		/*
		 * é isso ai 
		 */
		
		 String s2 = "potato apple lemon";
		 String[] vect = s2.split(" ");
		 
		 System.out.println(vect[0]);
		 System.out.println(vect[1]);
		 System.out.println(vect[2]);
		 
	}

}
