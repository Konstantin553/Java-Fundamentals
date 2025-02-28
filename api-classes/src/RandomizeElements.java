import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomizeElements {
    public static void main(String[] args) {
        ArrayList<String> list = readElements();
        randomizeElements(list);
        printElements(list);

    }


    private static <T> ArrayList<T> readElements() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<T> elements = new ArrayList<>();
        while (true){
            T line = (T) scanner.nextLine();
            if (line.equals("end")) {
                break;
            } else {
                elements.add(line);
            }
        }
        return elements;
    }

    private static <T> void randomizeElements(ArrayList<T> list) {
        Random randGen = new Random();
        for (int i = 0; i < list.size(); i++) {
            int randIndex = randGen.nextInt(list.size());
            Swap(list, i, randIndex);
        }
    }


    private static <T> void Swap( ArrayList<T> list, int pos1, int pos2) {
        T oldValue = list.get(pos1);
        list.set(pos1, list.get(pos2));
        list.set(pos2, oldValue);
    }

    private static <T> void printElements(ArrayList<T> list) {
        for (T i : list) {
            System.out.println(i);
        }
    }
}
