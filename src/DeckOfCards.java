public class DeckOfCards {

    public static void main(String[] args) {
        final int CLUBS = 0;
        final int DIAMONDS = 1;
        final int HEARTS = 2;
        final int SPADES = 3;
        final int JACK = 11;
        final int QUEEN = 12;
        final int KING = 13;
        final int ACE = 14;

        String[][] arr = new String[4][9];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {

                String suit = "";
                int randomSuit = (int) (Math.random() * 10) % 4;
                switch (randomSuit) {
                    case CLUBS -> suit = "Clubs";
                    case DIAMONDS -> suit = "Diamonds";
                    case HEARTS -> suit = "Hearts";
                    case SPADES -> suit = "Spades";
                }

                String rank = "";
                int randomRank = ((int) (Math.random() * 20) % 13) + 2;
                switch (randomRank) {
                    case JACK -> rank = "Jack";
                    case QUEEN -> rank = "Queen";
                    case KING -> rank = "King";
                    case ACE -> rank = "Ace";
                    default -> rank = ((Integer) randomRank).toString();
                }
                arr[i][j] = rank + " of " + suit;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print("Player-" + (i+1) + " : ");
            for (String s : arr[i]) {
                System.out.print(s + ",  ");
            }
            System.out.println();
        }
    }


}
