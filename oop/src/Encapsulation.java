import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
* Define a class Card, holding face + suit
* ▪The face can be one of these: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A
* ▪The suit can be one of these: ♣, ♦, ♥, ♠
* ▪Write a program to read a set of cards and print them sorted by face,
* then by suit (use the above arrangements)
* K♥Q♣4♦2♦10♥4♣2♠ -> 2♦2♠4♣4♦10♥Q♣K♥
 */
class Card implements Comparable<Card> {
    private String face;
    private char suit;

    public Card(String face, char suit) {
        this.setFace(face);
        this.setSuit(suit);
    }

    private static final String[] ALL_FACES = new String[]{
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
    };

    private static String ALL_SUITS = "♠♥♦♣";

    public void setFace(String face) {
        if (Arrays.stream(ALL_FACES).noneMatch(f -> f.equals(face))) {
            throw new IllegalArgumentException("Invalid face: " + face);
        }
        this.face = face;
    }

    public void setSuit(char suit) {
        if (ALL_SUITS.indexOf(suit) == -1) {
            throw new IllegalArgumentException("Invalid suit: " + suit);
        }
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public char getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "face='" + face + '\'' +
                ", suit=" + suit +
                '}';
    }

    @Override
    public int compareTo(Card otherCard) {
        int compareResult = Integer.compare(
                getCardFaceIndex(this),
                getCardFaceIndex(otherCard));
        if (compareResult == 0) {
            compareResult = Integer.compare(
                    ALL_SUITS.indexOf(this.suit),
                    ALL_SUITS.indexOf(otherCard.suit));
        }
        return compareResult;

    }

    private static int getCardFaceIndex(Card card){
        for (int i = 0; i < ALL_FACES.length; i++) {
            if (ALL_FACES[i].equals(card.face)) {
                return i;
            }
        }
        return -1;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputCards = scanner.nextLine().split("");
        ArrayList<Card> cards = new ArrayList<>();
        for (String cardText : inputCards) {
            char suit = cardText.charAt(cardText.length()-1);
            String face = cardText.substring(0, cardText.length()-1);
            Card card = new Card(face, suit);
            cards.add(card);
        }

        cards.sort((c1, c2) -> c1.compareTo(c2));

        String result = cards.toString();
        result = result.replace(" ", "");
        result = result.replace("[", "");
        result = result.replace("]", "");
        result = result.replace(",", " ");

        System.out.println(result);
    }
}
