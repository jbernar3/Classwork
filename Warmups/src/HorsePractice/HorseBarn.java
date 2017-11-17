package HorsePractice;

public class HorseBarn {
	private Horse[] spaces;
	
	public HorseBarn(Horse[] spaces)
	{
		this.spaces = spaces;
	}
	
	public int findHorseSpace(String name)
	{
		for (int i = 0; i < this.spaces.length; i++)
		{
			if (this.spaces[i]!=null && name.equalsIgnoreCase(this.spaces[i].getName()))
				return i;
		}
		return -1;
	}
	
	public void consolidate()
	{
		for (int i = 0; i < this.spaces.length-1; i++)
		{
			if (this.spaces[i] == null)
			{
				for (int j = i+1; j < this.spaces.length; j++)
				{
					if (this.spaces[j] != null)
					{
						this.spaces[i] = this.spaces[j];
						this.spaces[j] = null;
						j = this.spaces.length;
					}
				}
			}
		}
	}
	
	public String toString()
	{
		String output = "";
		for (Horse x : this.spaces)
		{
			if (x!=null)
				output+="["+x.getName()+"] ";
			
			else 
				output+="[null] ";
		}
		return output;
	}
}
