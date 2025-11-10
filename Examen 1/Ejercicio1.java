package recursividad;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realiza un procedimiento que genere números aleatorios entre 1 y 1000 y los muestre 
		 *mientras no salga uno múltiplo de 9. En cuanto salga el primer múltiplo de 9, éste 
		 *ya no se muestra y el procedimiento finaliza.*/

		new Ejercicio1().show();
	}
	
	public void show() {
		Random random= new Random();
		
		int num= random.nextInt(1000)+1;
		
		multiplo(num, random);
	}
	
	public void multiplo(int num, Random random) {
		
		if(num %9 != 0) {
			System.out.println(num);
			multiplo(num= random.nextInt(1000)+1, random);
			
		} else {
			System.out.println("Multiplo");
			
		}

	}

}
