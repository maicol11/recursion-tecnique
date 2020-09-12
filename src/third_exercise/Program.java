package third_exercise;

public class Program {

	public static void main(String[] args) {

		int array[] = {5, 8, 9, 8, 5};

		isPalindrome(array, 0, array.length-1);
	}

	public static void isPalindrome(int array[], int posRight, int posLeft) {
		
		int middle = array.length/2;
		
		if(middle != posRight) {
			if(array[posRight] == array[posLeft]) {
				isPalindrome(array, posRight+1, posLeft-1);
			}else {
				System.out.print("0");
			}
		}else {
			System.out.print("1");
		}			
		
	}
	
}
