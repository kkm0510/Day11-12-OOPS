package DeckOfCards;

import java.util.HashSet;

public class DeckOfCards {

    HashSet<Integer> set = new HashSet<>();
    CustomQueue<Player> playerQueue = new CustomQueue<Player>();

    public  void distributeCards() {
        for (int i = 0; i < 4; i++) {
            Player player = new Player();
            for (int j = 0; j < 9; j++) {
                int suit = (int) (Math.random() * 10) % 4;
                int rank = (int) (Math.random() * 10) % 13 + 2;
                int code = rank * 10 + suit;
                if (set.contains(code)) {
                    j--;
                } else {
                    set.add(code);
                    player.queue.add(code);
                }
            }
            playerQueue.add(player);
        }
    }

    public  void printDetails() {
        final int SPADES = 0;
        final int CLUBS = 1;
        final int DIAMONDS = 2;
        final int HEART = 3;
        final int JACK = 11;
        final int QUEEN = 12;
        final int KING = 13;
        final int ACE = 14;

        int i = 1;
        while (playerQueue.isEmpty()) {
            Player player = playerQueue.remove();
            System.out.println("Player " + i + " :- ");
            while (player.queue.isEmpty()) {
                String suit = "";
                int code = player.queue.remove();
                int lastDigit = code % 10;
                switch (lastDigit) {
                    case SPADES -> suit = "SPADES";
                    case CLUBS -> suit = "CLUBS";
                    case DIAMONDS -> suit = "DIAMONDS";
                    case HEART -> suit = "HEART";
                }
                String rank;
                code = code / 10;
                switch (code) {
                    case JACK -> rank = "Jack";
                    case QUEEN -> rank = "Queen";
                    case KING -> rank = "King";
                    case ACE -> rank = "Ace";
                    default -> rank = ((Integer) code).toString();
                }
                System.out.print(rank + " of " + suit + ", ");
            }
            System.out.println();
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        DeckOfCards game=new DeckOfCards();
        game.distributeCards();
        game.printDetails();
    }
}
