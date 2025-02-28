package tasks;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mathPower(scanner.nextDouble(), scanner.nextInt()));


    }
    public static double mathPower(double number, int power){
        int raisedToPower = 1;

        for (int i = 0; i < power; i++) {
            raisedToPower *= number;
        }
        return raisedToPower;
    }
}
