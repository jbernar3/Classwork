package Lab4_1;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Deck{
	public List<Card> unDealt = new ArrayList<Card>(); //an arrayList of all the cards in the deck
	public List<Card> Dealt = new ArrayList<Card>(); //an arrayList we will use to hold cards we have already seen, so we can shuffle them back in.
	
	public Deck(String[] ranks, String[] suits, int[] values) {
		for (int i=0; i<suits.length; i++)
		{
			for(int j=0; j<ranks.length; j++)
			{
				for(int k=0; k<values.length; k++)
				{
					Card x = new Card(ranks[j],suits[i],values[k]);
					this.unDealt.add(x);
				}
			}
		}
	}
	
	public boolean isEmpty()
	{
		if (this.size()==0)
			return true;
		
		return false;
	}
	
	public int size()
	{
		return this.unDealt.size();
	}
	
	public List<Card> deal()
	{
		Random rand = new Random();
		int index = rand.nextInt(this.unDealt.size());
		this.Dealt.add(unDealt.get(index));
		this.unDealt.remove(index);
		return this.unDealt;
	}
	
	public void shuffle()
	{
		while(Dealt.size()>0)
		{
			Random rand = new Random();
			int index = rand.nextInt(this.unDealt.size());
			unDealt.add(Dealt.get(index));
			Dealt.remove(index);
		}
		
		for (int i=this.unDealt.size(); i>-1; i--)
		{
			Random rand = new Random();
			int index = rand.nextInt(this.unDealt.size());
			int index2 = rand.nextInt(this.unDealt.size());
			while (index2==index)
			{
				index2 = rand.nextInt(this.unDealt.size());
			}
			Card dummy = unDealt.get(index);
			unDealt.set(index, (unDealt.get(index2)));
			unDealt.set(index2, dummy);
		}
	}

}
