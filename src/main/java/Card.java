public class Card implements Comparable<Card> {
    
    private String suit; 

    private String name; 
    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }

    public String getSuit() {
        return this.suit;
    }
  
    public String getName() {
        return this.name;
    }

  
    public void setName(String name) {
        this.name = name;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    

    @Override
    public int compareTo(Card card) {
        String[] cardName = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; 
        String[] suitName = {"Hearts", "Clubs", "Diamonds", "Spades"};        
        int cardNameIndex = -1;
        int suitNameIndex = -1;
        int otherCardNameIndex = -1;
        int otherSuitNameIndex = -1;
        for (int i = 0; i < cardName.length; i++) {
            if (name.equals(cardName[i])) {
                cardNameIndex = i;
            }
            if (card.name.equals(cardName[i])) {
                otherCardNameIndex = i;
            }
        }
        for (int i = 0; i < suitName.length; i++) {
            if (suit.equals(suitName[i])) {
                suitNameIndex = i;
            }
            if (card.suit.equals(suitName[i])) {
                otherSuitNameIndex = i;
            }
        }
        if (suitNameIndex != otherSuitNameIndex) {
            return suitNameIndex - otherSuitNameIndex;
        }
        return cardNameIndex - otherCardNameIndex;

    } 
    @Override
    public String toString() {
        return this.name + " of " + this.suit;
    }
}