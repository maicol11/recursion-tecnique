package fourth;

public class Program {

	public static void main(String[] args) {
		
		countDigits(5480, 0);
		
	}
	
	public static void countDigits(int number, int count) {
		
		if (number == 0){
			 System.out.println(count);
		}else {
			countDigits(number/10, count+1); 
		}              
		
	}

}
