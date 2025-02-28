package tasks;


public class MethodOverloading {
    public static void main(String[] args) {
        int maxInt = getGreaterValue(12, 13);
        char maxChar = getGreaterValue('a', 'z');
        String maxString = getGreaterValue("aaa", "bbb");
        System.out.println(maxInt);
        System.out.println(maxChar);
        System.out.println(maxString);
    }

    public static int getGreaterValue(int a, int b){
        if (a > b) {
            return a;
        }
        return b;
    }

    public static char getGreaterValue(char a, char b){
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        }
        return b;
    }

    public static String getGreaterValue(String a, String b){
        int compare = a.compareTo(b);
        if (compare < 0) {
            return b;
        } else if (compare > 0) {
            return a;
        }
        return a;
    }

}
