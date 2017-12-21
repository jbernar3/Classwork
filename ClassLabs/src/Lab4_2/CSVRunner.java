package Lab4_2;

import java.util.ArrayList;
import java.util.List;

public class CSVRunner {
	public static void main(String[] args)
	{
		CSVUtilities test = new CSVUtilities("DOITT_SUBWAY_ENTRANCE_01_13SEPT2010.csv");
		ArrayList<String> header = test.getColumnHeaders();
		for(int i=0; i<header.size(); i++)
		{
			System.out.println(header.get(i));
		}
	}
}
