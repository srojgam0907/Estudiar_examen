package recursividad;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Contar un digito en concreto
		
		new Ejercicio5().show();

	}
	
	public void show() {
		int num=0;
		int numBuscado=0;
		int contador=0;
		
		num=enterNumber(num);
		numBuscado=enterNumber(numBuscado);
		contador=searchNumber(num, numBuscado);
		
		System.out.printf("El %d aparece %d  veces", numBuscado, contador);
		
	}
	
	public int enterNumber(int num) {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		num= kb.nextInt();
		
		return num;
	}
	
	public int searchNumber(int num, int numBuscado) {
		int digit=0, contador=0;
		
		digit= num%10;
		
		if(num == 0) {
			return contador;
			
		}else if(digit==numBuscado) {
			contador++;
			
		}
		
		contador+= searchNumber(num/10, numBuscado);
		
		return contador;
	}

}
