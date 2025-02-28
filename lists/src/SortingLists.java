import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //passing array that acts like a list
        //sorting list from smallest to biggest
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 3, 2, 5, 10, -1));
        //get(0) < get(1) get(1) < get(2)
        //new list to put the sorted array
        List<Integer> sorted = new ArrayList<>();
        while (!numbers.isEmpty()){
            int min = numbers.get(0);
            int minIndex = 0;
            for (int i = 1; i < numbers.size(); i++) {
                int currentValue = numbers.get(i);
                if (currentValue < min) {
                    min = currentValue;
                    minIndex = i;
                }
            }
            sorted.add(numbers.remove(minIndex));//remove the indexes from numbers list and added to sorted list
        }

        for (Integer number : sorted) {
            System.out.print(number + " ");
        }


    }
    private static List<Integer> parseNumber(String line){
        List<Integer> numbers = new ArrayList<>();

        String[] splitLine = line.split(" ");

        for (String item : splitLine) {
            numbers.add(Integer.parseInt(item));
        }

        return numbers;
    }
}
