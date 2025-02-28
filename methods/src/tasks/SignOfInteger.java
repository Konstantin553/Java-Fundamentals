package tasks;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printNumberSign(scanner.nextInt());

    }

    public static void printNumberSign(int number){
        String signInfo;
        if (number > 0 ) {
            signInfo = "positive";
        } else if (number == 0) {
            signInfo = "zero";
        } else {
            signInfo = "negative";
        }

        System.out.printf("The number %d is %s%n", number, signInfo);
    }

}
