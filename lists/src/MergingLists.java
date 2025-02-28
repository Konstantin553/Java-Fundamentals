import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersA = parseNumbers(scanner.nextLine());
        List<Integer> numbersB = parseNumbers(scanner.nextLine());

        List<Integer> merged = new ArrayList<>();
        for (int i = 0; i < Math.max(numbersA.size(), numbersB.size()); i++) {
            if (numbersA.size() > i) {
                merged.add(numbersA.get(i));
            }

            if (numbersB.size() > i){
                merged.add(numbersB.get(i));
            }
        }

        for (int integer : merged) {
            System.out.print(integer + " ");
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
