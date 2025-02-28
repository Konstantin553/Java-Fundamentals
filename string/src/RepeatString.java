import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            result[i] = repeat(word, word.length());
        }

        System.out.println(String.join("", result));

    }

    static String repeat(String s, int times){
        // initialize an array of n elements
        // assign each of the elements to the word provided
        // join words with .join delimiter
        String[] repetitions = new String[times];

        for (int i = 0; i < times; i++) {
            repetitions[i] = s;
        }

        return String.join("", repetitions);
    }
}
