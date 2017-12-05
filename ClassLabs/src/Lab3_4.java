public class Lab3_4 {
	
	public static void main( String[] args)
	{
		System.out.println("PARTITION TEST");
		int[] test1= {2,5,4,3,6,8};
		partition(test1,0,test1.length-1);
		for(int x: test1)
		{
			System.out.print("["+ x +"]");
		}
	/*	//System.out.println(partition(test1,0,test1.length-1));
		System.out.println();
		System.out.println("SWAP TEST");
		int[] test2 = {1,2,3,4};
		swapMethod(test2, 1,3);
		for(int x: test2)
		{
			System.out.print("["+ x +"]");
		}
		System.out.println();
		System.out.println("QUICK SORT TEST");
		int[] test3={3,6,4,8,2,5,9};
		quickSort(test3,0,test3.length-1);
		for(int x: test3)
		{
			System.out.print("["+ x +"]");
		}
	*/
	}
	
	/*
	 * Partition method
	 * Chooses a pivot and moves all the integers greater than it on the right side of it and the integers less than it on the left side.
	 * @param int[] list1
	 * @param int front
	 * @param int back
	 * @return integer of the position of the array.
	 */
	public static int partition(int[] list1, int front, int back)
	{
		int positionPivot = front;
		int frontIndex = front+1;
		int backIndex = back;
		System.out.println(list1[frontIndex] +" " + list1[backIndex] + " " + list1[positionPivot]);
		boolean searchingBack = true;
		boolean searchingFront = false;
		while(backIndex>frontIndex)
		{
			//System.out.println("random");
			if (list1[positionPivot]>list1[backIndex] && searchingBack)
			{
				int j = 0;
				j = positionPivot;
				positionPivot = backIndex;
				//backIndex=j;
				swapMethod(list1, j, positionPivot);
				
				frontIndex= j+1;
				searchingBack = false;
				searchingFront = true;
			}
			else if (searchingBack && list1[positionPivot]<list1[backIndex])
			{
				backIndex--;
			}
			if (list1[positionPivot]<list1[frontIndex] && searchingFront)
			{

				
				int j = 0;
				j = positionPivot;
				positionPivot = frontIndex;
				swapMethod(list1, j, positionPivot);
			
				backIndex = j-1;
				searchingBack=true;
				searchingFront=false;
			}
			else if (searchingFront && list1[positionPivot]>list1[frontIndex])
			{
				frontIndex++;
			}
			
		}
		return positionPivot;
	}
	
	/*
	 * Swap Method
	 * Swaps two integers in a array of integers given their indexes.
	 * @param int[] list
	 * @param int pivotIndex
	 * @param int index
	 * @return void
	 */
	public static void swapMethod (int[] list, int pivotIndex, int index)
	{
		int dummy = list[index];
		list[index] = list[pivotIndex];
		list[pivotIndex] = dummy;
	}
	
	/*
	 * Quick Sort
	 * Recursively uses partition to sort an array of integers.
	 * @param int[] list1
	 * @param int front
	 * @param int back
	 * @return void
	 */
	public static void quickSort(int[] list1, int front, int back)
	{
		if (front<back)
		{
			int positionPivot = partition(list1,front,back);
			quickSort(list1,front,positionPivot);
			quickSort(list1,positionPivot+1,list1.length-1);
			
		}
	}
}