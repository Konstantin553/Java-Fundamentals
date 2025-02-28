import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Integer> numbers = parseNumbers(line);

        for (int number : numbers) {
            System.out.println(number);
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
