import java.util.Arrays;

public class Conversion {

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5};
		char[] charArray = {'a', 'b', 'c', 'd', 'e'};
		
		String[] combined = new String[intArray.length];
		
		for (int i = 0; i < intArray.length; i++) {
			combined[i] = intArray[i] + "" + charArray[i];
		
		}
<<<<<<< HEAD
		System.out.println("No changes"+Arrays.toString(combined));
System.out.println("No changes");

=======
		System.out.println(Arrays.toString(combined));
>>>>>>> 033be22de0b9706d0098a27ca1acd3e04e4eccb0
}
}
