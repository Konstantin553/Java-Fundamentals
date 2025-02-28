import java.util.*;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
//        int[] numbers = new int[] {1, 2, 3, 4};

//        Arrays.stream(numbers).filter(Stream::isEven); second option is to use a method

//        IntStream stream = Arrays.stream(numbers);
//        int min = stream.filter(number -> number % 2 == 0).min().getAsInt();
        //Use getAsInt() if we are confident that there is always going to be a value
        // or use orElse() if we are not confident

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Optional<Integer> x = numbers.stream()
                .map(number -> 4 * number)
                .filter(number -> number >= 10)
                .min(Comparator.naturalOrder());

        if (x.isPresent()) {
            System.out.println(x.get());
        } else {
            System.out.println("No items found");
        }


        



    }

//    private static boolean isEven(int number) {
//        return number % 2 == 0;
//    }
}
