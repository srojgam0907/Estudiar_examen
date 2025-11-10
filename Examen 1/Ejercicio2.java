package recursividad;

import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Modifica el ejercicio anterior para que solamente haya 7 posibilidades para encontrar 
		 *el múltiplo de 9. ¿cómo se llama la variable que has utilizado para las 7 posibilidades?
		 **/

		new Ejercicio2().show();
		
	}
	
	public void show() {
		Random random= new Random();
		int num= random.nextInt(1000)+1;
		int contador=0;
		
		multiplo(num, random, contador);
		
	}
	
	public void multiplo(int num, Random random, int contador) {
		
		if (num % 9 == 0) {
			System.out.println("Multiplo");
			
		} else if(contador == 7) {
			System.out.println("Sin oportunidades");
			
		} else {
			contador++;
			System.out.println(num);
			multiplo(num= random.nextInt(1000)+1, random, contador);
		}
	}

}
