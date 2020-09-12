package second_exercise;

public class Program {

	public static void main(String[] args) {
		
		int array[] = {3,7,25,13};
		greastestElement(array,0,0);
		

	}
	
	public static void greastestElement(int array[], int pos, int greastestNumber) {
		
		if(pos < array.length) {
			if(array[pos] > greastestNumber) {
				greastestElement(array, pos+1, array[pos]);
			}else {
				greastestElement(array, pos+1, greastestNumber);
			}
		}else {
			System.out.println("Greatest = " + greastestNumber);
		}
		
		
	}

}
