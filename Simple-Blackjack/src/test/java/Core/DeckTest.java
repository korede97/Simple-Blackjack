package Core;

import java.util.ArrayList;

import java.util.List;
import java.util.Collections;
import junit.framework.TestCase; 



public class DeckTest extends TestCase{
	
	static int deckSize = 4; 
	boolean aceIsSoft = false; 

	
	public void testAddCard() {
	    // List<Card> deck = new ArrayList<Card>();
	     Deck deck = new Deck(); 

	     Card card_1 = new Card("S1"); 
	     Card card_2 = new Card("S1"); 
	     Card card_3 = new Card("S1"); 
	     Card card_4 = new Card("S1"); 
	     
	     deck.AddCard(card_1); 
	     deck.AddCard(card_2); 
	     deck.AddCard(card_3); 
	     deck.AddCard(card_4); 
	     
	     assertFalse(deck.Empty()); 
	     

	     assertEquals(card_1,deck.topCard(1)); 

	}
	
	public void testAddCards() {
	     //List<Card> deck = new ArrayList<Card>();
	     List <Card> cardsToAdd = new ArrayList<Card>();
	     Deck deck = new Deck(); 
	     
	     Card card_1 = new Card("S1"); 
	     Card card_2 = new Card("S1"); 
	     Card card_3 = new Card("S1"); 
	     Card card_4 = new Card("S1"); 
	     
	     cardsToAdd.add(card_1); 
	     cardsToAdd.add(card_2); 
	     cardsToAdd.add(card_3); 
	     cardsToAdd.add(card_4); 
	     
	     deck.AddCards(cardsToAdd); 
	     
	     assertFalse(deck.Empty()); 

	     assertEquals(card_1,deck.topCard(1)); 

	}
	
	public void testDrawCard() {
	     //List<Card> deck = new ArrayList<Card>();
	     
	     Deck deck = new Deck(); 
 
	     int deckSizeBefore; 
	     int deckSizeAfter; 
	     boolean removedCard = false; 
	     
	     List <Card> cardsToAdd = new ArrayList<Card>();
	     
	     Card card_1 = new Card("S1"); 
	     Card card_2 = new Card("S1"); 
	     Card card_3 = new Card("S1"); 
	     Card card_4 = new Card("S1");  
	     
	     cardsToAdd.add(card_1); 
	     cardsToAdd.add(card_2); 
	     cardsToAdd.add(card_3); 
	     cardsToAdd.add(card_4); 
	     
	     deck.AddCards(cardsToAdd); 
	     
	     Card cardToRemove = deck.topCard(deckSize-1);  
	     
	     deckSizeBefore = deck.SizeOfDeck(); 
	     
	     deck.DrawCard(); 
	     
	     deckSizeAfter = deck.SizeOfDeck(); 
	     
	     assertEquals((deckSizeBefore - 1), deckSizeAfter);
	     
	     assertTrue(removedCard); 
	        
	}
    
	//check that all cards are added to deck...


}
