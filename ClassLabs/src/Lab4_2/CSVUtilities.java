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
		ArrayList<String> CSVData = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		
		
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
				this.numColumns = row.length;
			}
			br.close();
		}
		
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}	
		this.CSVData = CSVData;
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
	
	public ArrayList<Integer> getDataInt(int column)
	{
		ArrayList<Integer> columnIntSet = new ArrayList<>();
		for (int i=column; i<this.CSVData.size(); i+=this.numColumns)
		{
			Integer dataInt = null;
			try {
				dataInt = Integer.parseInt(this.CSVData.get(i));
			}
			catch(NumberFormatException e) {
				i+=this.numColumns;
				continue;
			}
			columnIntSet.add(dataInt);
		}
		return columnIntSet;
		
	}
	
	public ArrayList<Double> getDataDouble(int column)
	{
		ArrayList<Double> columnDoubleSet = new ArrayList<>();
		for (int i=column; i<this.CSVData.size(); i+=this.numColumns)
		{
			Double dataDouble = null;
			try {
				dataDouble = Double.parseDouble(this.CSVData.get(i));
			}
			catch(NumberFormatException e) {
				i++;
				continue;
			}
			columnDoubleSet.add(dataDouble);
		}
		return columnDoubleSet;
		
	}
}
