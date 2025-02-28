package tasks;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printGrade(scanner.nextDouble());


    }
    public static void printGrade(double score){
        String grade;
        if (score >= 2 && score <= 2.99) {
            grade = "Fail";
        } else if (score >= 3 && score <= 3.49) {
            grade = "Poor";
        } else if (score >= 3.50 && score <= 4.49) {
            grade = "Good";
        } else if (score >= 4.50 && score <= 5.49) {
            grade = "Very Good";
        } else {
            grade = "Excellent";
        }

        System.out.printf(grade);
    }
}
