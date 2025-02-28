import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       Arrays.stream(scanner.nextLine().split(" "))
                .filter(word -> word.length() % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(word -> System.out.println(word));


    }
}
