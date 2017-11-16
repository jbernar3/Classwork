/*
 * Created by Jefferson C. Bernard and Muhammad Usman
 * Period 6-7
 * Levin - AP Comp Sci A
 * 11/15/17 final
 */
public class Lab3_1 {
	public static void main(String[] args)
	{
		//testing remove() function.
		int[] test = {0,4,5,6,3,4,9};
		test = remove(test,3);
		for (int x:test)
		{
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		
		//testing remove Duplicates function.
		int[] test2 = {0,7,6,7,0,4,3,2};
		test2 = removeDuplicates(test2);
		
		for (int x:test2)
		{
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		
		//Testing productArray() function.
		int[] testp = {2,3,4};
		int[] testp2 = {1,2,3};
		int[][] productTest = productArray(testp,testp2);
		System.out.println(productTest[1][2]);
		System.out.println("-----------------------------");
		
		//Testing pascalTriangle() and printPascalTriangle() functions.
		int[][] testTriangle = pascalTriangle(8);
		printPascalTriangle(testTriangle);
		
	}
	
	/*
	 * removeDuplicates() function removes a number if it appears multiple times in an array of integers but leaves one of them.
	 * @param array of integers.
	 * @return the array of integers the user put in but modified.
	 */
	public static int[] removeDuplicates(int[] list)
	{
		for(int i=0;i<list.length;i++)
		{
			for(int j=i+1; j<list.length;j++)
			{
				if (list[i] ==list[j])
					list = remove(list,j);
			}
		}
		return list;
		
	}
	
	/*
	 * remove() helper function that removes a integer from an array of integers given the number's index.
	 * @param the array of integers and the index of the number wanted to remove.
	 * @return a copy of the user's array of integers but modified.
	 */
	public static int[] remove(int []list, int x)
	{
		int[] newArray = new int[list.length-1];
		boolean isDeleted = false;
		for(int y=0; y<list.length; y++)
		{
			if (y==x)
				isDeleted= true;
			
			if(y!=x)
			{
				if(isDeleted)
					newArray[y-1] = list[y];
				
				else
					newArray[y] = list[y];
			}
		}
		return newArray;
	}
	
	/*
	 * productArray() creates a multiplication table out of two arrays of integers.
	 * @param two arrays of integers.
	 * @return a multidimensional array of arrays of integers.
	 */
	public static int[][] productArray(int [] arr1, int[] arr2)
	{
		int[][] table;
		table = new int[arr1.length][arr2.length];
		//System.out.println(arr1[0] + " " + arr2[0]);
		for(int i=0; i<arr1.length; i++)
		{
			//System.out.println(arr1[i]);
			for (int j=0; j<arr2.length; j++)
			{
				//System.out.println(arr2[j]);
				table[i][j] = (arr1[i])*(arr2[j]);
			}
		}
		return table;
	}
	
	/*
	 * pascalTriangle() creates a pascal triangle with a given amount of rows.
	 * @param integer of the amount of rows.
	 * @return multidimensional array of arrays of integers that forms the pascal triangle.
	 */
	public static int [][] pascalTriangle(int n)
	{
		int[][] result = new int[n][];
		for(int x= 0; x<n; x++)
		{
			result[x]= new int[x+1];
			for(int y=0; y<= x; y++)
			{
				if (y==0||y==x)
					result[x][y]=1;
				
				else
					result[x][y]=result[x-1][y-1]+result[x-1][y];
			}
		}
		
		return result;
	}
	
	/*
	 * printPascalTriangle() prints a given pascal triangle.
	 * @param multidimensional array of arrays of integers that is the pascal triangle.
	 */
	public static void printPascalTriangle(int[][] pTriangle)
	{
		int rowSpace = pTriangle.length*2;
		int lengthOfLastRow = 0;
		int amountOfRows = pTriangle.length;
		
		if (amountOfRows>5)
		{
			lengthOfLastRow = 13 + (3*(amountOfRows-6));
		}
		else
		{
			
		}
		System.out.println(lengthOfLastRow);
		
		for (int x=0; x<pTriangle.length; x++)
		{
			
			for (int i=0; i<rowSpace; i++)
			{
				System.out.print(" ");
			}
			
			for (int y=0; y<pTriangle[x].length; y++)
			{
				if (x<5)
				{
					System.out.print(pTriangle[x][y] + "   ");
				}
				else
				{
					if(pTriangle[x][y]> 9 && pTriangle[x][y+1]>9)
					{
						System.out.print(pTriangle[x][y] + "  ");
					}
					else
						System.out.print(pTriangle[x][y] + "   ");
				}
			}
			rowSpace-=2;
			System.out.println("");
			
		}
	}
}
