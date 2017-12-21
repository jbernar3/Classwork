package Lab4_2;

import java.util.ArrayList;
import java.util.List;

public class CSVRunner {
	public static void main(String[] args)
	{
		CSVUtilities test = new CSVUtilities("Demographic_Statistics_By_Zip_Code.csv");
	/*	ArrayList<String> header = test.getColumnHeaders();
		for(int i=0; i<header.size(); i++)
		{
			System.out.print("["+header.get(i)+"]");
		}*/
		ArrayList<String> columnSet=test.getDataString(0);
		ArrayList<Double> count=test.getDataDouble(3);
		for(int i=0; i<count.size(); i++)
		{
			System.out.print("["+columnSet.get(i)+" && "+(count.get(i)*100)+"]");
		}
	}
}
