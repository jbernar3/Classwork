package Lab4_1;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class DeckTester {

	public static void main(String[] args)
	{
		String[] ranks = {"Lion","Great White","Chihuahua"};
		String[] suits = {"King","Nothing","Average"};
		int[] pointValues = {1,2,3,4,5,6,7};
		Deck testDeck = new Deck(ranks,suits,pointValues);
		testDeck.shuffle();
		for(int i=0; i<testDeck.size(); i++)
		{
			System.out.print(testDeck.unDealt.get(i).toString());
		}
		System.out.println();
		
	}
}
