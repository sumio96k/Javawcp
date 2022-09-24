
public class Chapter08 {
	public static void main(String[] args) {
		int number = 0;
		while (number < 5) {
			number++;
			System.out.println("Answer1 = " + number*number);
		}
		int[] array = {1,2,3,4};
		
		for ( int i = 0; i < array.length; i++) {
			System.out.println("Answer2 = " + array[i]);
		}
		
		for ( int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println("Answer3 = " + val);
		}
	}
}
