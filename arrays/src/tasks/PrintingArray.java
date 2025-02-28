package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[]{1, 2, 3};

//        String[] words = new String[numbers.length];
//        for (int i = 0; i < words.length; i++) {
//            words[i] = String.valueOf(numbers[i]);
//        }
//
//        String commaSeparate = String.join(",", words);
        System.out.println(Arrays.toString(numbers));



//        String[] words = new String[] {"Hello", "World"};
//
//        for (int i = 0; i < words.length; i++) {
//            System.out.print(words[i]);
//            if (i < words.length - 1) {
//                System.out.print(",");
//            }
//        }
//        System.out.println();

//        for (int i = 0; i < words.length; i++) {
//            System.out.printf("words[%d] = %s%n", i, words[i]);
//        }

    }
}
