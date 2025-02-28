package tasks;

import java.util.Scanner;

public class ForeachLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[] {"Hello", "Arrays"};

        int index = 0;
        for(String item : strings ){
            System.out.println(index + "." + item);

            index++;
        }
    }
}
