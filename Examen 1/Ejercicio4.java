package recursividad;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ejercicio4().show();
		
	}

	public void show() {
		int num=0;
		int reverseNum=0;
		
		num= enterNumber(num);
		reverseNum= invertirNum(num, reverseNum); 
		
		System.out.printf("reverse: %d", reverseNum);
	}
	
	public int enterNumber(int num) {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		
		do {
			System.out.println("Introduce un numero de más de dos cifras");
			num= kb.nextInt();
			
			if (num < 10) {
				System.out.println("ERROR");
			}
		
		} while(num < 10);
		
		return num;
	}
	
	public int invertirNum(int num, int reverseNum) {
		int digit=0;
		
		if(num == 0) {
			return reverseNum;
			
		} else {
			digit= num%10;
			
			reverseNum= invertirNum(num/10, reverseNum= reverseNum*10+digit); 
			
		}
		
		return reverseNum;
	}
}
