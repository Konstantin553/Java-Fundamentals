import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Objects {
    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(1999, 5, 20);

        List<LocalDate> birthdays = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int birthdayCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < birthdayCount; i++) {
            int year = Integer.parseInt(scanner.nextLine());
            int month = Integer.parseInt(scanner.nextLine());
            int day = Integer.parseInt(scanner.nextLine());

            LocalDate birthday = LocalDate.of(year, month, day);

            birthdays.add(birthday);
        }

        for (LocalDate birthday : birthdays) {
            System.out.printf("%d %d %d %n", birthday.getYear(), birthday.getMonth().getValue(), birthday.getDayOfMonth());
        }


//        System.out.println(myBirthday);
//        System.out.println(myBirthday.getYear());
    }
}
