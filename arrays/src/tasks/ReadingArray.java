package tasks;

import java.util.Scanner;

public class ReadingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] elements = line.split(" ");

        int[] numbers = new int[elements.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
            System.out.println(numbers[i]);
        }



//        int n = Integer.parseInt(scanner.nextLine());
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(scanner.nextLine());
//        }

    }
}
