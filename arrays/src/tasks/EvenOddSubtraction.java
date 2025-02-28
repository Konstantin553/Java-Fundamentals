package tasks;

import java.util.Scanner;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");
        int[] numbers = new int[strings.length];

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }

       for (int number : numbers){
            if (number % 2 == 0){
                sumEven += number;
            } else {
                sumOdd += number;
            }
       }

       int difference = sumEven - sumOdd;
        System.out.println(difference);

    }
}
