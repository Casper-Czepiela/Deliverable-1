/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @author Megha Patel
 */
public abstract class Card {
    //default modifier for child classes
    enum Colour{
        Red,Blue,Green,Yellow,Wild_Card;
    private static Colour[] colours = Colour.values();
    public static Colour getColour(int i)
    {
        return Colour.colours[i];
    }
    }
    enum cardValue{
        Zero,One,Two,Three,Four,Five,Six,Seven,Eight,Nine,DrawTwo,SkipTurn,Reverse,PickFour;
        private static final cardValue[] cValue = cardValue.values();
        public static cardValue getCardValue(int i)
        {
            return cardValue.cValue[i];
        }
    }
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();

}
