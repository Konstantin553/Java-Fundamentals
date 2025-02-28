import java.util.Scanner;

public class SubstringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "hello, what's up";
        System.out.println(text.indexOf("up"));//indexOf() returns the first match index or -1
        System.out.println(text.substring(7, 13));//substring returns part from a given string
        System.out.println(text.contains("helo"));//contains checks whether one string contains other string
        System.out.println(text.split("hello"));
    }
}
