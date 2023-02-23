package br.com.byteBank.banco.Excption;

public class MinhaExption extends RuntimeException{
	
	 public MinhaExption(String message) {
		 super(message);
		 System.out.print(message);
	    }
	
}
	
