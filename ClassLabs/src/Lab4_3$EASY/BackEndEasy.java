package Lab4_3$EASY;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import Lab4_2.CSVUtilities;

public class BackEndEasy {
	
	public PrintWriter pw = null;
	public ArrayList<String> CSVData;
	
	
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
		//System.out.println(sb.toString());
		ArrayList<String> CSVData = new ArrayList<>();
		Path pathToFile = Paths.get("results2.csv");
		
		
		try (BufferedReader br = Files.newBufferedReader(pathToFile))
		{
			String line = br.readLine();
			while (line !=null)
			{
				String[] row = line.split(",");
				for(String x : row)
				{
					CSVData.add(x);
				}
				line = br.readLine();
			}
			br.close();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}	
		this.CSVData = CSVData;
	}


	public void addScore(int score)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("----,"+score+"\n");
		//System.out.println(sb.toString());
		this.pw.write(sb.toString());
		this.pw.flush();
		this.CSVData.add("----");
		this.CSVData.add(score+"");
	}
	
	public int getHighScore()
	{
		ArrayList<Integer> allScores = new ArrayList<>();
		for (int i = 3; i<this.CSVData.size(); i+=2)
		{
			int temp = Integer.parseInt(this.CSVData.get(i));
			allScores.add(temp);
		}
		if(allScores.size()==0)
		{
			return 0;
		}
		int high = 0;
		for(int i=1; i<allScores.size(); i++)
		{
			high = allScores.get(i);
			for(int j=i+1; j<allScores.size(); j++)
			{
				if (high < allScores.get(j))
				{
					high = allScores.get(j);
					i=j;
					j= allScores.size();
				}
			}
		} 
		return high; 
	} 
}
