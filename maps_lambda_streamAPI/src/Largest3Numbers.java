import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" "))//read a line from the console, split it in spaces
                .map(word -> Integer.parseInt(word))//map each word converted into and integer
                .sorted(Comparator.reverseOrder())//sort them in reverse order
                .limit(3)//get only the first 3 items
                .forEach(word -> System.out.println(word));//iterate those 3 items and print them
    }
}
