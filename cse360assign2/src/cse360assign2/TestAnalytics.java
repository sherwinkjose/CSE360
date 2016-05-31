package cse360assign2;

public class TestAnalytics extends Analytics
{
	public static void main(String[] args)
	{
		Analytics listy = new Analytics();
		
		listy.insert(1);
		listy.insert(2);
		listy.insert(3);
		listy.insert(4);
		listy.insert(5);
		listy.insert(6);
		listy.insert(7);
		listy.insert(8);
		listy.insert(9);
		listy.insert(10);
		listy.insert(11);
		listy.insert(12);
		
		
		listy.print();
		listy.mean();
		listy.median();
		listy.high();
		listy.low();
		listy.numInts();
		
	}
	
	
}

