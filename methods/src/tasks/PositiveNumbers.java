package tasks;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = parseIntegers(scanner.nextLine());
        System.out.println(countPositive(numbers));
    }

    public static int countPositive(int[] numbers){
        int numPositive = 0;
        for (int number : numbers) {
            if (number > 0) {
                numPositive++;
            }
        }
        return numPositive;
    }

    public static int[] parseIntegers(String s){
        String[] items = s.split(" ");
        int[] numbers = new int[items.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }
        return numbers;
    }
}
