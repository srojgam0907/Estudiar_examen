package recursividad;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Palindromo
		
		new Ejercicio7().show();

	}
	
	public void show() {
		String text="";
		boolean isPalindrome;
		
		text= enterText(text);
		isPalindrome= palindrome(text);
		
		if(isPalindrome) {
			System.out.printf("La cadena %s es palindroma", text);
			
		} else {
			System.out.printf("La cadena %s no es palindroma", text); 
			
		}
		
	}
	
	public String enterText(String text) {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto");
		text= kb.nextLine();
		
		return text;
	}

	public boolean palindrome(String text) { 
		text= text.toLowerCase().replace(" ", "");
		
		if(text.length() <= 1) {
			return true;
			
		} else if(text.charAt(0) != text.charAt(text.length()-1)) {
			return false;
			
		}
		
		return palindrome(text.substring(1, text.length()-1)); 
		
	}
}
