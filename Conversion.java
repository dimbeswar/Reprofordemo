import java.util.Arrays;

public class Conversion {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5};
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};

        String[] combined = new String[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            combined[i] = intArray[i] + "" + charArray[i];

        }
        System.out.println("No changes"+Arrays.toString(combined));


    }
}
