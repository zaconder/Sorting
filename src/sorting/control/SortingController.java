package sorting.control;

import sorting.model.Gui;
import sorting.model.SortingMachine;
import sorting.view.SortingFrame;

import java.util.*;

public class SortingController
{
	private SortingFrame appFrame;
	private SortingMachine mySorter;
	private int [] wholeNumbers;
	private ArrayList<Integer> wholeArrayNumbers;
	private double [] realNumbers;
	private String [] wordage;
	private Gui[] stuffage;
	
	public SortingController()
	{
		mySorter = new SortingMachine();
		appFrame = new SortingFrame(this);
		wholeArrayNumbers = new ArrayList<Integer>();
	}
	
	public int[] getWholeNumbers()
	{
		return wholeNumbers;
	}
	
	public ArrayList<Integer> getWholeArrayNumbers()
	{
		return wholeArrayNumbers;
	}
	
	public double[] getRealNumbers()
	{
		return realNumbers;
	}

	public String[] getWordage()
	{
		return wordage;
	}
	
	public Gui[] getStuffage()
	{
		return stuffage;
	}

	public void setWholenumbers(int[] wholenumbers)
	{
		this.wholeNumbers = wholenumbers;
	}
	
	public void setWholeArrayNumbers(ArrayList<Integer> wholeArrayNumbers)
	{
		this.wholeArrayNumbers = wholeArrayNumbers;
	}
	
	public void setRealNumbers(double[] realNumbers)
	{
		this.realNumbers = realNumbers;
	}

	public void setWordage(String[] wordage)
	{
		this.wordage = wordage;
	}
	
	public void setStuffage(Gui[] stuffage)
	{
		this.stuffage = stuffage;
	}

	public SortingMachine getMySorter()
	{
		return mySorter;
	}
	
	public void start()
	{
		fillTheArrays();
	}


	private void fillTheArrays()
	{
		randomIntArray();	
		randomStuffIntArray();
		randomDoubleArray();
		randomGui();
		randomWords();
	}

	private void randomDoubleArray()
	{
		realNumbers = new double[10];
		for(int spot = 0; spot < realNumbers.length; spot++)
		{
			realNumbers[spot] = Math.random()* 9000;
			if(spot% 7 > 3 && spot % 9 < 3)
				//makes numbers negative
			{
				realNumbers[spot]*= -1.000;
			}
		}
	}
	
	private void randomIntArray()
	{
		wholeNumbers = new int [5000];
		for(int spot = 0; spot < wholeNumbers.length; spot++)
		{
			wholeNumbers[spot] = (int)(Math.random()* 25634);
		}
		
	}
	
	private void randomStuffIntArray()
	{
		wholeNumbers = new int [5000];
		for(int spot = 0; spot < wholeNumbers.length; spot++)
		{
			int myRandom = (int)(Math.random()* 25634);
			wholeNumbers[spot] = myRandom;
			wholeArrayNumbers.add(myRandom);
		}	
		
	}
	
	private void randomWords()
	{
		wordage = new String []
				{
		"mentos",
		"Abstract",
		"they",
		"Because",
		"jousting",
		"hey",
		"pretend",
		"yeah",
		"Caterpillar",
		"yaya",
		"kitkat",
		"kitties",
		"in",
		"order",
		"from",
		"lost",
		"the",
		"neither",
		"greatest",
		"dust",
		"echo",
		"oposite"
				};
	}
	
	private void randomGui()
	{
		stuffage = new Gui[20];
		
		for(int row = 0; row < stuffage.length; row++)
		{
			if(stuffage[row] == null)
			{
				int temp = (int) (Math.random() * 144);
				boolean isCool;
				if(temp < 32)
				{
					isCool = true;

				}
				else
				{
					isCool = false;

				}
				stuffage[row] = new Gui("Gui # " + row, temp, isCool);
			}
		}
	}

}
