package deckofcards;

public class DeckOfCardsMain
{
	public static void main(String[] args)
	{
		DeckOfCards deckOfCardsObject = new DeckOfCards();
		deckOfCardsObject.deckInitialize();
		deckOfCardsObject.shuffle();
		deckOfCardsObject.PrintDistribute();
	}
}
