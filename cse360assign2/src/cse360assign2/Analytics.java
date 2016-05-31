package cse360assign2;

public class Analytics extends OrderedIntList 
{
	
	

	public double mean()
	{
		if (array != null)
		{
			int sum = 0;
			int counter = 0;
			double mean;
		
			for(int index = 0; index < array.length; index++)
				{
					sum = sum + array[index];
					if(array[index] > 0)
					{
						counter++; 
					}
				}
		
			mean = sum/counter;
			System.out.println(mean);
			return mean;
			
		
		}else
		{
			return -1;
		}
	}
	
	public double median()
	{
		if (array != null)
		{
			int middle = 0;
			double median;
		
			for(int index = 0; index < array.length; index++)
				{
					
					middle = array[array.length/2];
				}
		
			median = middle;
			System.out.println(median);
			return median;
		
		}else
		{
			return -1;
		}
		
	}
	public int high()
	{
		if (array != null)
		{
			int high = 0;
			
			for(int index = 0; index < (array.length -1); index++)
				{
					if(array[index] < array[index + 1])
					{
						high = array[index + 1];
					}
				}	
			System.out.println(high);
			return high;
		
		}else
		{
			return -1;
		}
	}
	public int low()
	{
		if (array != null)
		{
			int low = array[0];
			
			for(int index = 0; index < (array.length - 1); index++)
				{
					if(array[index] < low)
					{
						 low = array[index];
					}
				}	
			System.out.println(low);
			return low;
		
		}else
		{
			return -1;
		}
	}
	public int numInts()
	{
		int size = 0;
		size = array.length;
		return size;
	}
}
