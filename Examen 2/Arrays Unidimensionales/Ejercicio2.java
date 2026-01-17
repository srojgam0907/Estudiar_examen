package arraysUnidimensionales;

public class Ejercicio2 {
	//Realiza una función que reciba un array de enteros y devuelva la suma de todos los elementos.
	
	public static void main(String[] args) {
		new Ejercicio2().show();
	}
	
	public void show() {
		int[] array= {1,2,3,4,5,6};
		
		System.out.printf("El resultado es: %d", sumarElementos(array));
		
	}
	
	public int sumarElementos(int[] array) {
		int sum=0;
		
		for(int i=0; i<array.length; i++) {
			sum+= array[i];
			
		}
		
		return sum;
	}
}
