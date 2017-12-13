import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsRemove {
	public static void main(String[] args)
	{
		List<Integer> test = new ArrayList<Integer>();
		for(int i=0; i<10; i++)
		{
			Random rand = new Random();
			test.add(rand.nextInt(10)+1);
		}
		for(int i=0; i<test.size(); i++)
		{
			System.out.print("["+test.get(i)+"]");
		}
		System.out.println();
		test=removeDupes(test);
		for(int i=0; i<test.size(); i++)
		{
			System.out.print("["+test.get(i)+"]");
		}
	}
	
	public static List<Integer> removeDupes(List<Integer> nums)
	{
		Collections.sort(nums);
		
		for(int i=0; i<nums.size(); i++)
		{
			for(int j=i+1; j<nums.size(); j++)
			{
				if(nums.get(i)==nums.get(j))
				{
					nums.remove(j);
					j--;
				}
				else
				{
					j=nums.size()+1;
				}
			}
		}
		return nums;
	}
}
