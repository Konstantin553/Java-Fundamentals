package tasks;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        for (int i = 0; i < strings.length / 2; i++) {
            int firstIndex = i;
            int lastIndex = strings.length - 1 - i;

            String oldIndex = strings[firstIndex];
            strings[firstIndex] = strings[lastIndex];
            strings[lastIndex] = oldIndex;

        }

        System.out.println(String.join(" ", strings));
    }

}
