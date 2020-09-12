package first_exercise;

public class Program {

	public static void main(String[] args) {
		int number = 17;
		System.out.print(number);
		isPrimeNumber(number, number);

	}
	
	public static void isPrimeNumber(int number, int original) {
		
		if(original==1) {
			System.out.print(" Is not a prime number (only divide by 1)");
		}else {

			if(original%(number-1)==0) {
				if((number-1) == 1) {
					System.out.print(" Is  a prime number");
				}else {
					System.out.print(" Is not a prime number, is a compound number");
				}
				
			}else {
				isPrimeNumber(number-1, original);
				
			}
		}
		
	}

}
