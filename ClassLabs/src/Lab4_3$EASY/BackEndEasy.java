package Lab4_3$EASY;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Lab4_2.CSVUtilities;

public class BackEndEasy {
	
	public PrintWriter pw = null;
	
	public BackEndEasy()
	{
		StringBuilder sb = new StringBuilder();
		try
		{
			this.pw = new PrintWriter(new File("results2.csv"));
		}
		catch(FileNotFoundException e)
		{
			System.err.println(e);
		}
		sb.append("Name,High Score\n");
		this.pw.write(sb.toString());
		this.pw.flush();
		System.out.println(sb.toString());
		
	}


	public void addScore(int score)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("----,"+score+"\n");
		System.out.println(sb.toString());
		this.pw.write(sb.toString());
		this.pw.flush();
	}
	
	public int getHighScore()
	{
		ArrayList<Integer> column = new ArrayList<>();
		CSVUtilities test = new CSVUtilities("results2.csv");
		column = test.getDataInt(0);
		if(column.size()==0)
		{
			return 5;
		}
		int high = 0;
		for(int i=1; i<column.size(); i++)
		{
			high = column.get(i);
			for(int j=i+1; j<column.size(); j++)
			{
				if (high < column.get(j))
				{
					high = column.get(j);
					i=j;
					j=column.size();
				}
			}
		} 
		return high;
	} 
}
