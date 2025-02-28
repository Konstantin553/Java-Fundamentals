import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SameElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        String[] line2 = scanner.nextLine().split(" ");
        int[] arr1Sorted = Arrays.stream(line1)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        int[] arr2Sorted = Arrays.stream(line2)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        System.out.println(Arrays.equals(arr1Sorted, arr2Sorted) ? "Yes" : "No");


//        Scanner scanner = new Scanner(System.in);
//        String[] arr1 = scanner.nextLine().split(" ");
//        String[] arr2 = scanner.nextLine().split(" ");
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        if (Arrays.equals(arr1, arr2)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
    }
}
