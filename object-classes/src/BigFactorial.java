import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger factorial = BigInteger.valueOf(1);

        int n = scanner.nextInt();
        for (int i = 2; i <= n ; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial.toString());
    }
}
