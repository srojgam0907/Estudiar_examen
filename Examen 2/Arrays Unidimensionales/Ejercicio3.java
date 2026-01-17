package arraysUnidimensionales;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Realiza un procedimiento que reciba un array de enteros y un número. 
		 *El procedimiento tendrá que mostrar:
		 * 
		 * 		-En qué posiciones del array aparece dicho número.
		 * 		-Cuántas veces aparece dicho número en total en el array. 
		 */
		
		new Ejercicio3().show();

	}
	
	public void show() {
		int[] array= {5,4,5,6,5,5,8};
		int num= 5;
		
		posiciones(array, num);
		
	}
	
	public void posiciones(int[] array, int num) {
		int contador= 0;
		
		for(int i=0; i< array.length; i++) {
			if(array[i] == num) {
				System.out.printf("Posicion %d\n", i+1); 
				contador++;
				
			}
		}
		
		if(contador == 0) {
			System.out.printf("El numero %d no aparece\n", num);
			
		} else {
			System.out.printf("El numero %d ha aparecido %d veces\n", num, contador);
		}
		
	}

}















