import java.io.BufferedReader; 
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List; 


public class csvpractice {
	public static void main(String[] args)
	{
		List<String> statements = readStringsFromCSV("Book1.csv");
		for (String x : statements)
		{
			System.out.println(x);
		}
	}
	
	public static List<String> readStringsFromCSV(String fileName)
	{
		List<String> statements = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		
		try (BufferedReader br = Files.newBufferedReader(pathToFile))
		{
			String line = br.readLine();
			while (line !=null)
			{
				statements.add(line);
				line = br.readLine();
			}
			br.close();
		}
		
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}	
		return statements;
	}
}
