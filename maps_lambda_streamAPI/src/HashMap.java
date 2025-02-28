import java.util.Map;
import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> people = new java.util.HashMap<>();

        people.put("George", 27);
        people.put("Peter", 37);
        people.put("Ana", 21);

//        people.remove("Peter");
//        boolean hasName = people.containsKey("Adda");

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.printf("%s %d %n", entry.getKey(), entry.getValue());//printing key and value
        }


    }
}
