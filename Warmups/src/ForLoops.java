public class ForLoops {
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6};
		System.out.println(average(arr));
		addOne(arr);
		System.out.println(average(arr));
	}
	
	public static void addOne(int[] nums)
	{
		for (int i=0; i<nums.length; i++)
		{
			nums[i] = nums[i] +1;
		}
	}
	
	public static double average(int[] nums)
	{
		double total = 0.0;
		for (int x : nums)
		{
			total+=x;
		}
		return total/nums.length;
	}
}
