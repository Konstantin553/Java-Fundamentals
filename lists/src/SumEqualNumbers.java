import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumEqualNumbers {
    public static void main(String[] args) {
        //for this task is better to use while loop, because the index is changing
        //when there is a sequence of numbers is better to use for loop, otherwise while loop is better
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = parseNumbers(scanner.nextLine());

        int index = 0;

        while (index < numbers.size() - 1){
            int nextIndex = index + 1;

            Integer currentItem = numbers.get(index);
            Integer nextItem = numbers.get(nextIndex);
            if (currentItem == nextItem) {
                int sum = currentItem + nextItem;
                numbers.set(index, sum);
                numbers.remove(nextIndex);
                index = 0;
            } else {
                index++;
            }
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }


    }

    private static List<Integer> parseNumbers(String line){
        List<Integer> numbers = new ArrayList<>();

        String[] splitLine = line.split(" ");

        for (String item : splitLine) {
            numbers.add(Integer.parseInt(item));
        }

        return numbers;
    }
}

