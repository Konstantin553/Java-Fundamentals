package tasks;

public class Main {
    public static void main(String[] args) {
        printLineOfSymbols();
        System.out.println("\nHello methods");
        printLineOfSymbols();
        
    }

    public static void printLineOfSymbols(){
        for (int i = 0; i < 19; i++) {
            System.out.print("$");
        }
    }
}
