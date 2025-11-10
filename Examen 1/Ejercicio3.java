package recursividad;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Contar las cifras de un numero
		
		new Ejercicio3().show();

	}
	
	public void show() {
		int number= 0;
		int digits=0;
		
		number= enterNumber(number);
		digits= countDigits(number, digits);
		
		System.out.printf("Este numero tiene %d digitos", digits);
	}
	
	public int enterNumber(int number) {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		
		do {
			System.out.println("Introduce un numero de mas de una cifra");
			number= kb.nextInt();
			
			if (number <10) {
				System.out.println("ERROR");
			}
			
		} while(number < 10);
				
		return number;
	}
	
	public int countDigits(int number, int digits) {
		
		if (number == 0) {
			return digits; 
			 
		} 
		
		return countDigits(number/10, digits+1);
		
	}

}
