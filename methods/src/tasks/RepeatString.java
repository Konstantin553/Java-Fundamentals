package tasks;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int times = scanner.nextInt();
        System.out.println(repeatStr(word, times));
    }

    public static String repeatStr(String repeatString, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text += repeatString;
        }
        return text;
    }
}
