import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeforeObjects {
    public static void main(String[] args) {
//        String name;
//        int id;
//        double averageGrade;

        //Peter
        //123123
        //6


        List<String> names = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();
        List<Double> averageGrades = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfStudents; i++) {
            String name = scanner.nextLine();
            int id = Integer.parseInt(scanner.nextLine());
            double averageGrade = Double.parseDouble(scanner.nextLine());
            names.add(name);
            ids.add(id);
            averageGrades.add(averageGrade);
        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%s (%d) - %f\n", names.get(i), ids.get(i), averageGrades.get(i));
        }

    }

private static List<Integer> parseNumbers(String line){
    List<Integer> numbers = new ArrayList<>();

    String[] splitLine = line.split(" ");

    for (String item : splitLine) {
        numbers.add(Integer.parseInt(item));
    }

    return numbers;
    }
}
