package recursividad;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Contar una letra concreta
		
		new Ejercicio6().show();

	}
	
	public void show() {
		Scanner kb= new Scanner(System.in);
		String text="";
		char letter= 0;  
		int numLetter=0;
		
		text= enterText(text, kb);
		letter= enterLetter(letter, kb);
		text= text.toLowerCase();
		
		numLetter= countLetter(text, letter);
		
		System.out.printf("Esa palabra tiene %d %s", numLetter, letter);
	}
	
	public String enterText(String text, Scanner kb) {
		
		System.out.println("Introduce una cadena de texto");
		text= kb.nextLine();
		
		return text;
	}
	
	public char enterLetter(char letter, Scanner kb) {
		
		System.out.println("Introduce la letra que quieres contar");
		letter= kb.next().charAt(0);
		
		return letter;
	}
	
	public int countLetter(String text, char letter) {
		int numLetter=0;
		char currentLetter;
		
		if(text.length() == 0) {
			return numLetter;
			
		} 
		
		currentLetter= text.charAt(0);
		
		if(currentLetter == letter) {
			numLetter++;
			
		}
		
		numLetter+= countLetter(text.substring(1, text.length()), letter);
		
		return numLetter; 
	}

}
