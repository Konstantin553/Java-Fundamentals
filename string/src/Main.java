import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    //Strings are immutable, you cant change its value once created
   // Any change that we do on the data is not really a change, it is a copy of the data that gets returned
   //Here we create a new copy of the text string
   //Java has full Unicode Support
    String text = "баница";
    text = text.toUpperCase();
    //We can access their index values, but we cannot change them
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

    //converting char array into string
    char[] letters = new char[] {'a', 'b', 'c'};

    String convertText = new String(letters);
    System.out.println(convertText);
    //convert it back to charArray
    char[] textChar = convertText.toCharArray();

    }
}
