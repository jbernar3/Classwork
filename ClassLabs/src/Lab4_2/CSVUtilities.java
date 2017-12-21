package Lab4_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilities {
	private ArrayList<String> CSVData;
	private int numColumns;

	public CSVUtilities(String fileName)
	{
		
		Path pathToFile = Paths.get(fileName);
		
		String line = null;
		try (BufferedReader br = Files.newBufferedReader(pathToFile))
		{
			while ((line = br.readLine())!=null)
			{
				this.CSVData.add(line);
			}
		}
		
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}	
		if (CSVData.isEmpty()==false)
		{
			String[] row = this.CSVData.get(0).split(",");
			this.numColumns = row.length;
		}
	}
	
	public ArrayList<String> getColumnHeaders()
	{
		ArrayList<String> headers2 = new ArrayList<>();
		for (int i=0; i<this.numColumns; i++)
		{
			headers2.add(this.CSVData.get(i));
		}
		return headers2;
	}
	
	public ArrayList<String> getDataString(int column)
	{
		ArrayList<String> columnSet = new ArrayList<>();
		for (int i=column; i<this.CSVData.size(); i+=this.numColumns)
		{
			columnSet.add(this.CSVData.get(i));
		}
		return columnSet;
	}
}
