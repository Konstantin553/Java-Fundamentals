import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleClasses {

    static class Student {
        private String name;
        private int id;
        private double averageGrade;

        Student(String name, int id, double averageGrade){
            this.name = name;
            this.id = id;
            this.averageGrade = averageGrade;
        }

        void setName(String name){
            this.name = name;
        }

        void setAverageGrade(double averageGrade){
            this.averageGrade = averageGrade;
        }

        public String getName(){
            return name;
        }

        public int getId(){
            return id;
        }

        public double getAverageGrade(){
            return averageGrade;
        }

        public String asString(){
            return String.format("%s (%d) - %f", getName(), getId(), getAverageGrade());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < studentsCount; i++) {
            String name = scanner.nextLine();
            int id = Integer.parseInt(scanner.nextLine());
            double averageGrade = Double.parseDouble(scanner.nextLine());

            Student student = new Student(name, id, averageGrade);

            students.add(student);
        }

        for (Student student : students) {
            System.out.println(student.asString());
        }

        int index = 0;
        while(index < students.size()){
            if (students.get(index).name.isEmpty()) {
                students.remove(index);
            } else {
                index++;
            }
        }

    }
}
