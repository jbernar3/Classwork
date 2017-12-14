package Lab4_1;

public class Card{
	
	private String rank;
	private String suit;
	private int pointValue;
	
	public Card(String rank, String suit, int pointValue) 
	{
		this.rank=rank;
		this.suit=suit;
		this.pointValue=pointValue;
	}
	
	public String getRank()
	{
		return this.rank;
	}
	
	public String getSuit()
	{
		return this.suit;
	}
	
	public int getPointValue()
	{
		return this.pointValue;
	}
	
	public boolean equals(Card other)
	{
		if (this.suit==other.getSuit() && this.rank==other.getRank()&&this.pointValue==other.getPointValue())
			return true;
		
		return false;
	}
	
	public String toString()
	{
		return "["+this.getRank()+" of suit "+this.getSuit()+" worth "+this.getPointValue()+"]";
	}

}
