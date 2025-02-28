import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Collection {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4};

        int[] even = Arrays.stream(numbers).filter(number -> number % 2 == 0).toArray();

        for (int i : even) {
            System.out.println(i);
        }

        //for Strings
//        String[] numbers = new String[] {"1", "2", "3", "4"};
//
//        int[] even = Arrays.stream(numbers)
//                .mapToInt(numberStr -> Integer.parseInt(numberStr))
//                .filter(number -> number % 2 == 0)
//                .toArray();
//
//        for (int i : even) {
//            System.out.println(i);
//        }

        //convert to List
//        String[] numbers = new String[] {"1", "2", "3", "4"};
//
//        List<Integer> evenBoxed = Arrays.stream(numbers)
//                .mapToInt(numberStr -> Integer.parseInt(numberStr))
//                .filter(number -> number % 2 == 0)
//                .collect(Collectors.toList());
//
//        for (int i : even) {
//            System.out.println(i);
//        }

    }
}
