package br.edu.unifei.ecoi09.starwars.deck;

public class AdvancedDeckFactory implements IOrderFactory {
    @Override
    public ICardFactory createOrder(){
        ICardFactory advancedDeck = new AdvancedDeck();
        return advancedDeck;
    }
}
