import java.util.Scanner;

/*
▪ Write a program to enter an integer in certain range, e. g. 10-20
▪ Read a range(two integers start<= end) and print the range
▪ When an invalid number in entered or the number is out of
range, print "Invalid number: {num}" and enter a number again
▪ When the entered number is valid, print "Valid number: {num}"
*/


public class NumberInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] range = scanner.nextLine().split(" ");
        int start = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);
        System.out.println("Range: [" + start + "..." + end + "]");
        int num = readInputInRange(scanner, start, end);
        System.out.println("Valid number: " + num);
    }

    private static int readInputInRange(Scanner scanner, int start, int end) {
        while (true){
            String inputLine = scanner.nextLine();
            try {
                int num = Integer.parseInt(inputLine);
                if (num >= start && num <= end) {
                    return num;
                }
            } catch (Exception ex){

            }
            System.out.println("Invalid number: " + inputLine);
        }

    }
}
