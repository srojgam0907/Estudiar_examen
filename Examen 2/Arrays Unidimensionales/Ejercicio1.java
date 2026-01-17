package arraysUnidimensionales;

import java.util.Scanner;
import ejercicios6_2.ConsoleInput;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realiza un procedimiento que cree un array de enteros 
		 *y le solicite un booleano al usuario. Si el booleano
		 *es true, el procedimiento debe mostrar los elementos 
		 *que ocupan las posiciones pares.
		 */
		
		new Ejercicio1().show();
		
	}

	public void show() {
		Scanner kb=new Scanner(System.in);
		ConsoleInput ci= new ConsoleInput(kb);
		
		int[] array= {1,2,3,4,5,6};
		boolean posicion;
		boolean error; 
		int value;
		
		do {
			System.out.println("Pulsa el 1 si quieres mostrar las posiciones pares o pulsa 2 si quieres mostrar las posiciones impares");
			value= ci.readInt();
			
			if(value != 1 && value != 2) {
				System.out.println("ERROR. Debes meter un 1 o un 2. Vuelve a intertarlo");
				error= true;
				
			} else {
				error= false;
			}
			
		}while(error);
		
		if(value == 1) {
			posicion= true;
			
		} else {
			posicion= false;
			
		}
		
		for(int i=0; i<array.length; i++) {
			if(posicion) {
				if(i %2 == 0) {
					System.out.println(array[i] + " ");
				}
				
			} else { 
				if(i %2 != 0) {
					System.out.println(array[i] + " ");
				}
			}
		}
		
	}
}











