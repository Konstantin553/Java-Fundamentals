package tasks;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = parseIntegers(scanner.nextLine());
        multiplySum(numbers);

    }

    public static void multiplySum(int[] numbers){
        int sumEven = 0;
        int sumOdd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        int sum = sumEven * sumOdd;
        System.out.println(sum);
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
