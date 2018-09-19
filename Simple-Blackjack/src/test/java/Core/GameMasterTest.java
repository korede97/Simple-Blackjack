package Core;

import junit.framework.TestCase;

public class GameMasterTest extends TestCase {
	
	/*public void testEndOfTurn() {
		GameMaster game = new GameMaster();
		String [] input = { "CA", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJ", "CQ", "CK",
				"DA", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJ", "DQ", "DK",
				"HA", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJ", "HQ", "HK",
				"SA", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJ", "SQ", "SK"};
		
	//	Deck shuffleDeck = new Deck();
		Player player = new Player(); 
		game.deck.createDefaultDeck(input);
		game.deck.shuffleDeck();
		char inputH = 'H'; 
		char inputS = 'S'; 
		
		game.bettingSequence(inputH);
		game.bettingSequence(inputS);
		
		assertFalse(game.player.getHand().turn);
		
	}*/
	
	public void testPlayerBustDealerWin() {
		GameMaster game = new GameMaster();
		
		Card card1 = new Card("S10"); 
		Card card2 = new Card("D10"); 
		Card card3 = new Card("S5"); 
		Card card4 = new Card("SJ"); 
		Card card5 = new Card("S3"); 

		game.player.getHand().addCard(card1);
		game.player.getHand().addCard(card2);
		game.player.getHand().addCard(card3);
		game.dealer.getHand().addCard(card4);
		game.dealer.getHand().addCard(card5);
		
		game.checkBust(); 
		
		assertTrue(game.dealerIsWinner); 
	}
}
