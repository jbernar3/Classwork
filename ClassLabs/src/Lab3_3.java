/*
 * Jefferson C. Bernard and Muhammad Usman
 * Period 6-7
 * Levin - AP Computer Science A
 * Finished Date: 11/28/17
 */
public class Lab3_3
{
	public static void main( String[] args)
	{
		System.out.println("INSERTION SORT");
		int[] test1 = {4,3,8,7,6};
		insertionSort(test1);
		for(int x: test1)
		{
			System.out.print("["+ x +"]");
		}
		int[] test2= new int[5];
		test2[0]=3;
		test2[1]=2;
		test2[2]=1;
		test2[3]=0;
		System.out.println();
		System.out.println("MOVE OVER TEST");
		moveOver(test2, 0, 1);
		
		for(int x: test2)
		{
			System.out.print("["+ x +"]");
		}
		System.out.println();
		System.out.println("SELECTION SORT");
		double[] test3= {3,2,2,4,2,5,4,7,9,8};
		selectionSort(test3);
		for(double x: test3)
		{
			System.out.print("["+ x +"]");
		}
		System.out.println();
		System.out.println("BUBBLE SORT");
		String[] test4= {"one", "two", "four", "six", "zero","asaprocky","jcole","uzi","xxxtentacion", "yatchy"};
		bubbleSort(test4);
		for(String x: test4)
		{
			System.out.print("["+ x +"]");
		}
	}
	
	/*
	 * Insertion Sort 
	 * Sorts an array of integers by taking each element from the array and adding it to the front of the array
	 * in the correct order.
	 * @param int[] list1
	 * @return void
	 */
	public static void insertionSort(int[] list1)
	{
		for (int i=0; i<list1.length-1; i++)
		{
			
				if (list1[i+1]<list1[i])
				{
					boolean foundPlace= false;
					int j = i;
				
					while(!foundPlace)
					{
						if(j==-1)
						{
							foundPlace=true;
						}
						else if(list1[j]<list1[i+1])
						{
							foundPlace=true;
						}
						else
						{
							j--;
						}
					
					}
					int dummy= list1[i+1];
					moveOver(list1, j+1,i+1);
					list1[j+1]= dummy;

				}
			}
	}
	
	/*
	 * Move Over function
	 * Moves each item in the array over one position in the given interval.
	 * @param int[] array
	 * @param int x starting position of interval inclusive
	 * @param int y ending position of interval inclusive
	 * @return void
	 */
	public static void moveOver(int[]array, int x, int z)
	{
		int nextNum= array[x];
		for(int y=x; y<z; y++)
		{
			int dummy = array[y+1];
			array[y+1]= nextNum;
			nextNum = dummy;
		}
	}
	
	/*
	 * Selection Sort function 
	 * Sorts an array of doubles by finding the lowest element and placing it in the front of the array.
	 * @param double[] list1
	 * @return void
	 */
	public static void selectionSort(double [] list1)
	{
		for(int i=0; i<list1.length; i++)
		{
			double smallest = list1[i];
			for(int j=i+1;j<list1.length; j++)
			{
				if(smallest>list1[j])
				{
					double dummy = list1[i];
					smallest = list1[j];
					list1[j]= dummy;
					
					
				}
				
			}
			list1[i]= smallest;
		}
	}
	
	/*
	 * Bubble Sort
	 * Iterates through the list and swapping any out of order elements until there are no more swaps required.
	 * @param String[] list1
	 * @return void
	 */
	public static void bubbleSort(String[] list1)
	{
		boolean swapZero = false;
		while(!swapZero)
		{
			int numSwap=0;
			for(int i=0; i<list1.length-1; i++)
			{
				
				if((list1[i].compareToIgnoreCase(list1[i+1]))>0)
				{
					String dummy= list1[i];
					list1[i]=list1[i+1];
					list1[i+1]=dummy;
					numSwap++;
					
				}
			}
			if(numSwap==0)
			{
				swapZero=true;
			}
		}
	}
}