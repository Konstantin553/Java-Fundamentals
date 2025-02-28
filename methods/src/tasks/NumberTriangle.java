package tasks;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printTriangle(scanner.nextInt());

    }

    public static void printTriangle(int width){
        for (int i = 1; i <= width ; i++) {
            printIncreasingSequence(i);
        }

        for (int i = width - 1; i >= 1; i--) {
            printIncreasingSequence(i);
        }
    }

    public static void printIncreasingSequence(int lastNumber){
        for (int i = 1; i <= lastNumber; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
