import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }

        Collections.sort(products);

        int count = 1;
        for (String product : products) {
            System.out.printf("%d.%s\n", count, product);
            count++;
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
