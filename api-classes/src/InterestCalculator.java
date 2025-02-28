import java.math.BigDecimal;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal amount = new BigDecimal(scanner.nextLine());
        BigDecimal interest = new BigDecimal(scanner.nextLine());
        interest = interest.divide(new BigDecimal(100));
        BigDecimal result = amount.multiply(BigDecimal.ONE.add(interest));
        System.out.println(result);
    }
}
