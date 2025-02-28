public class FindMax {
    public static <T extends Comparable<T>> T findMax(T... elements) {
        // Check if the array is empty
        if (elements == null || elements.length == 0) {
            return null;  // Return null if no elements
        }

        T max = elements[0]; // Start with the first element
        for (T element : elements) {
            // Compare each element with the current max
            if (element.compareTo(max) > 0) {
                max = element; // Update max if current element is larger
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Test for Integer
        Integer maxInt = findMax(1, 2, 3, 4, 5);
        System.out.println("Max Integer: " + maxInt); // Output: 5

        // Test for Double
        Double maxDouble = findMax(1.2, 3.4, 2.3);
        System.out.println("Max Double: " + maxDouble); // Output: 3.4

        // Test for Character
        Character maxChar = findMax('a', 'z', 'g');
        System.out.println("Max Character: " + maxChar); // Output: z

        // Test for String
        String maxString = findMax("apple", "orange", "banana");
        System.out.println("Max String: " + maxString); // Output: orange
    }
}
