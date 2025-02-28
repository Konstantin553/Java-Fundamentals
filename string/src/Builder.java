

public class Builder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(" ");
        builder.append(123);

        String s = builder.toString();

        System.out.println(s);




    }
}
