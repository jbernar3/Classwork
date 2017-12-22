package Lab4_2;

import java.util.ArrayList;
import java.util.List;

public class CSVRunner {
	public static void main(String[] args)
	{
		CSVUtilities test = new CSVUtilities("Water_Consumption_In_The_New_York_City (1).csv");
	/*	ArrayList<String> header = test.getColumnHeaders();
		for(int i=0; i<header.size(); i++)
		{
			System.out.print("["+header.get(i)+"]");
		}*/
		ArrayList<String> columnSet=test.getDataString(0);
		ArrayList<Integer> count=test.getDataInt(3);
		for(int i=1; i<count.size(); i++)
		{
			System.out.print("["+columnSet.get(i+1)+" && "+(count.get(i-1))+"]");
		}
	}
}
