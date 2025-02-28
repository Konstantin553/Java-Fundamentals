import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = readNumbers();
        Random randGen = new Random();
        for (int i = 0; i < list.size(); i++) {
            int randIndex = randGen.nextInt(list.size());
            Swap(list, i, randIndex);
        }
        for (Integer i : list) {
            System.out.println(i);
        }

    }

    private static void Swap( ArrayList<Integer> list, int pos1, int pos2) {
        Integer oldValue = list.get(pos1);
        list.set(pos1, list.get(pos2));
        list.set(pos2, oldValue);
    }

    private static ArrayList<Integer> readNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            } else {
                int num = Integer.parseInt(line);
                list.add(num);
            }
        }
        return list;
    }
}
