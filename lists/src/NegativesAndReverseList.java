import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NegativesAndReverseList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseNumber(scanner.nextLine());

        int i = 0;
        while (i < numbers.size()){
            if (numbers.get(i) < 0) {
                numbers.remove(i);//if we remove the current index, we should not increase the index, because there is new data at that index
            } else {
                i++;
            }

        }

        Collections.reverse(numbers);

        if (numbers.isEmpty()) {
            System.out.println("empty");
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }

    private static List<Integer> parseNumber(String line){
        List<Integer> numbers = new ArrayList<>();

        String[] splitLine = line.split(" ");

        for (String item : splitLine) {
            numbers.add(Integer.parseInt(item));
        }


        return  numbers;
    }
}
