package br.edu.unifei.ecoi09.starwars.deck;

public class BeginnerDeckFactory implements IOrderFactory {
    @Override
    public ICardFactory createOrder(){
        ICardFactory beginnerDeck = new BeginnerDeck();
        return beginnerDeck;
    }
}
