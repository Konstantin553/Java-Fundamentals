package tasks;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacter(text);
    }

    public static void printMiddleCharacter(String text){
        int length = text.length();

        if (length % 2 != 0) {

            int indexOfMiddleChar = length / 2;
            System.out.print(text.charAt(indexOfMiddleChar));

        } else {
            int indexOfFirstMiddleChar = length / 2 - 1;
            int indexOfSecondMiddleChar = length / 2;
            System.out.print(text.charAt(indexOfFirstMiddleChar));
            System.out.print(text.charAt(indexOfSecondMiddleChar));
        }
    }
}
