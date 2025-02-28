import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Printing a list using join method
//        List<String> words = new ArrayList<>(Arrays.asList("hello", "goodbye"));
//
//        String joined = String.join(", ", words);
//        System.out.println(joined);

        //Printing list using for loop
        String line = scanner.nextLine();

        List<Integer> numbers = parseNumbers(line);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%d at index %d\n", numbers.get(i), i);
        }



    }

    private static List<Integer> parseNumbers(String line) {
        List<Integer> numbers = new ArrayList<>();

        String[] splitLine = line.split(" ");

        for (String item : splitLine) {
            numbers.add(Integer.parseInt(item));
        }
        return numbers;
    }
}
