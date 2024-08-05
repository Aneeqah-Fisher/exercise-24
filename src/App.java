import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] deck = new int[52];
        int count = 0;

        // Initialize the deck
        for (int i = 0; i < deck.length; i++) {
            deck[i] = (i % 13) + 1;
        }

        // Assign values to face cards
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] == 1) {
                deck[i] = 1; // Ace
            } else if (deck[i] == 11) {
                deck[i] = 11; // Jack
            } else if (deck[i] == 12) {
                deck[i] = 12; // Queen
            } else if (deck[i] == 13) {
                deck[i] = 13; // King
            }
        }

        Random random = new Random();
        int sum = 0;

        // Pick cards until the sum is 24
        while (sum != 24) {
            sum = 0;
            for (int i = 0; i < 4; i++) {
                int card = deck[random.nextInt(52)];
                sum += card;
            }
            count++;
        }

        System.out.println("Number of picks that yields the sum of 24: " + count);
    }
}
