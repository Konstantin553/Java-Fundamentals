import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InitializingList {
    public static void main(String[] args) {

        /*
            Lists are internally like arrays essentially
            Everything you see in Arrays you can do in Lists as well
            We can iterate lists the same way as arrays with different types of loops(for, foreach, while...)
            add() - adds elements
            remove() - removes elements
            size() - size of the list (like .length for arrays)
            get() - returns a value of an index
         */

//        List<String> words = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        while(!line.equals("end")){
//            words.add(line);
//            line = scanner.nextLine();
//        }

        //Printing the list
//        for (int i = words.size() - 1; i >= 0; i--) {
//            String word = words.get(i);
//            System.out.print(word + " ");
//        }

        /*
        Integers in Lists
         */

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(12);
//        numbers.add(123);

        //copy elements from array to a list
        int[] numbersArray = new int[]{1, 2, 3};

        List<Integer> numbers = new ArrayList<>();

        for (int number : numbersArray) {
            numbers.add(number);
        }

        //copy String elements from array to list
        // we copy directly without for loop to the list by creating new list from the wordsArray (new part of memory)
        String[] wordsArray = new String[]{"Hello", "Goodbye", "Hey"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArray));

        words.remove("Goodbye");
        words.remove(1);

        for (String word : words){
            System.out.println(word);
        }


    }
}
