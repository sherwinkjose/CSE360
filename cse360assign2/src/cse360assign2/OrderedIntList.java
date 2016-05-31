/*
 * Sherwin Jose
 * PIN: 415
 * Description: Insert an integer into an array so the list is maintained in ascending order
 * and no duplicate values are stored. The array should also drop the last number when the capacity
 * is full. 
*/

package cse360assign2;

public class OrderedIntList 
{
	protected int[] array;  //initialize array
	protected int count; //counter to iterate through array
	private boolean bool;
	
	//create array with 10 spaces
	OrderedIntList ()
	{
		array = new int[10];
	}
	
	//Insert method to insert new variables into the array
	public void insert (int variable) 
	{
		if(count == array.length) //checks to see if array size needs to increase
		{
			grow();
		}
		
		if(count == 0) //inputs 1st variable into array
		{ 
			array[0] = variable;
			count++;
		}
		else 
		{
			int iterator = 0;
			for (int index = 0; index < count; index++, iterator++)
			{
				if(variable < array[index]) 
					{
						break;
					}
			}
			for (int index = count; index > iterator; index--)
			{ 
				array[index] = array[index-1];
			}
			
			array[iterator] = variable; 
			count++;		
		}
	}
	//Grow method to increase the maximum size of the array
	private void grow()
	{
		int[] newArray = new int[count*2];
		for (int index = 0; index < count; index++ )
		{
			newArray[index] = array[index];
		}
		array = newArray;
	}
	//Print method to print out the integers within the array
	public void print () 
	{
		for (int index = 0; index < count; index++) 
		{
			if (index%5 == 0) 
			{
				System.out.println();			
			}	
			System.out.print(array[index] + "\t");
		}
		System.out.println();
	}
}