import java.util.*;

public class OptimalSortingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(21, 23, 42, 75, 100, -11));

//        Collections.sort(numbers);//sorted in ascending order
        Collections.sort(numbers, (a, b) -> Integer.compare(Math.abs(a % 10), Math.abs(b % 10)));//you can also compare two values
//        Collections.reverse(numbers);//sorted in reverse order

        for (Integer number : numbers) {
            System.out.print(number + " ");
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
