public class ManipulatingStrings {
    public static void main(String[] args) {
        //concatenating
        String text = "Hello, ";
        text += "John";
        System.out.println(text);

        String greet = "Hello, ";
        String name =  "John";
        String result = greet.concat(name);
        System.out.println(result);
    }
}
