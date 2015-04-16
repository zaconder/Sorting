package sorting.model;

import java.util.ArrayList;


public class SortingMachine
{
	
	private long startTime;
	private long endTime;
	private long sortTime;
	
	public long getSortTime()
	{
		return sortTime;
	}
	
	public String sortingTime(long sortTime)
	{
		String timeToSort = "";
		
		timeToSort += "\n";
		timeToSort += "Days: " + sortTime/(1000*60*60*24) + "\n";
		timeToSort += "Hours: " + sortTime/(1000*60*60) % 24 + "\n";
		timeToSort += "Minutes: " + sortTime/(1000*60) % 60 + "\n";
		timeToSort += "Seconds: " + sortTime/(1000) % 60 + "\n";
		timeToSort += "Milliseconds: " + sortTime % 1000 + "\n";
		
		return timeToSort;
	}
	
	
	public void quickSort(int [] toBeSorted, int lo, int hi)
	{
		
		if (lo < hi)
		{
			int p = partition(toBeSorted, lo, hi);
			quickSort(toBeSorted, lo, p - 1);
			quickSort(toBeSorted, p + 1, hi);
		}
		
	}
	
	public int partition(int[] toBeSorted, int lo, int hi)
	{
		
		int	pivotIndex = choosePivot(toBeSorted, lo, hi);
		int	pivotValue = toBeSorted[pivotIndex];
		
		swap(toBeSorted, pivotIndex, hi);
		int storeIndex = lo;
		
		for(int position = lo; position <= hi-1; position++)
		{
				if(toBeSorted[position] < pivotValue)
				{
					swap(toBeSorted,position, storeIndex);
					storeIndex++;
				}
		}
		swap(toBeSorted, storeIndex, hi);
		
		return pivotIndex;
	}
	
	public int choosePivot(int [] toBeSorted, int lo, int hi)
	{
		
		int	pivot = lo +(hi-lo)/2;
		return pivot;
		
	}
	
	public int[] selectionSort(int [] toBeSorted)
	{
		
		int minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();
		for(int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];
			for(int next = position +1; next < toBeSorted.length; next++)
			{
				if(toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if(minimumPosition != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		
		sortTime = endTime - startTime;
		
		return toBeSorted;
	}
	
	public ArrayList<Integer> selectionArraySort(ArrayList<Integer> toBeSorted)
	{
		
		int minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();
		for(int position = 0; position < toBeSorted.size(); position++)
		{
			minimumPosition = position;
			minimum = toBeSorted.get(position);
			for(int next = position +1; next < toBeSorted.size(); next++)
			{
				if(toBeSorted.get(next) < minimum)
				{
					minimum = toBeSorted.get(next);
					minimumPosition = next;
				}
			}
			if(minimumPosition != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		
		sortTime = endTime - startTime;
		
		return toBeSorted;
	}
	
	public String[] selectionSort2(String[] strings)
	{
		
		String maximum;
		int maximumPosition;
		startTime = System.currentTimeMillis();
		for(int position = 0; position < strings.length; position++)
		{
			maximumPosition = position;
			maximum = strings[position];
			for(int next = position +1; next < strings.length; next++)
			{
				if(strings[next].compareTo(maximum) < 0)
				{
					maximum = strings[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(strings, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		
		sortTime = endTime - startTime;
		
		return strings;
	}
	
	public double[] selectionSort3(double[] strings)
	{
		
		double maximum;
		int maximumPosition;
		startTime = System.currentTimeMillis();
		for(int position = 0; position < strings.length; position++)
		{
			maximumPosition = position;
			maximum = strings[position];
			for(int next = position +1; next < strings.length; next++)
			{
				if(strings[next] < maximum)
				{
					maximum = strings[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(strings, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		
		sortTime = endTime - startTime;
		
		return strings;
	}
	
	public Gui [] selectionSort4(Gui[] unsortedGui)
	{
		
		Gui maximumGui;
		int maximumPosition;
		startTime = System.currentTimeMillis();
		for(int position = 0; position < unsortedGui.length; position++)
		{
			
			maximumPosition = position;
			maximumGui = unsortedGui[position];
			for(int next = position+1; next < unsortedGui.length; next++)
			{
				if(unsortedGui[next].compareTo(maximumGui) > 0)
				{
					maximumGui = unsortedGui[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(unsortedGui, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		
		sortTime = endTime - startTime;
		
		return unsortedGui;
	}
	
	private void swap(int[] array, int position, int change)
	{
		int temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	private void swap(ArrayList<Integer> array, int position, int change)
	{
		int temp = array.get(position);
		array.set(position, array.get(change));
		array.set(change, temp);
	}
	
	private void swap (Gui[] array, int position, int change)
	{
		Gui temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	private void swap (String[] array, int position, int change)
	{
		String temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	private void swap (double[] array, int position, int change)
	{
		double temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
}
