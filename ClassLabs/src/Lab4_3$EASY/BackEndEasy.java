package Lab4_3$EASY;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Lab4_2.CSVUtilities;

public class BackEndEasy {
	static StringBuilder sb = new StringBuilder();

	public static PrintWriter writeCSV()
	{
		PrintWriter pw = null;{
		try
		{
			pw = new PrintWriter(new File("results.csv"));
		}
		catch(FileNotFoundException e)
		{
			System.err.println(e);
		}
		sb.append("Name,High Score\n");
		pw.write(sb.toString());
		pw.close();
		}
		return pw;
	}
	
	public static void addScore(int score)
	{
		sb.append("----,"+score+"\n");
	}
	
	public static int getHighScore()
	{
		ArrayList<Integer> column = new ArrayList<>();
		CSVUtilities test = new CSVUtilities("results.csv");
		column = test.getDataInt(1);
		if(column.size()==0)
		{
			return 0;
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
