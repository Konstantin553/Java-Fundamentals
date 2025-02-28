import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Map<String, Person> people = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();//next() returns a string without all the whitespaces before the string
            int age = scanner.nextInt();

            people.put(name, new Person(name, age));
        }
        String name = scanner.next();
        Person person =  people.get(name);
        if (person != null) {
            System.out.println(person.getAge());
            }
        }
    }
