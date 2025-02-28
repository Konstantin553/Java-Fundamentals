import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "hello, what's up";

        String keyword = "up";
        int currentPosition = 0;
        List<String> parts = new ArrayList<>();
        while(currentPosition < text.length()){
            int keywordIndex = text.indexOf(keyword, currentPosition);
            if (keywordIndex != -1) {
                String part = text.substring(currentPosition, keywordIndex);
                parts.add(part);
                currentPosition = keywordIndex + keyword.length();
            } else {
                parts.add(text.substring(currentPosition));
                break;
            }
        }

        System.out.println(String.join("", parts));

    }
}
