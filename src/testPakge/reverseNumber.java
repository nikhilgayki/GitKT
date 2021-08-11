package testPakge;

public class reverseNumber {
	
	public static void main(String[] args) {
		
		//Traditioncal Way to Do.
		/*
		 * int num =321;
		 * 
		 * while(num>0) {
		 * 
		 * int rev=num % 10; System.out.print(rev); num=num/10; }
		 */
		
		reverseNumber(1236);
	}
	
	//Reverse A Number using Recursion
	public static void reverseNumber(int number) {
		
		if(number<10) {
			System.out.print(number);
			return;
		}else {
			System.out.print(number%10);
		
			reverseNumber(number/10);
		}
		
	}

}
