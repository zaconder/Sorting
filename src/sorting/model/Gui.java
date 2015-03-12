package sorting.model;

public class Gui implements Comparable
{
	private String name;
	private int temp;
	private boolean isCool;
	
	public Gui(String name, int temp, boolean isCool)
	{
		this.name = name;
		this.temp = temp;
		this.isCool = isCool;
	}

	public String getName()
	{
		return name;
	}
	
	public double getTemp()
	{
		return temp;
	}
	
	public boolean isCool()
	{
		return isCool;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setTemp(int temp)
	{
		this.temp = temp;
	}
	
	public void setCool(boolean cool)
	{
		this.isCool = cool;
	}
	
	@Override
	public String toString()
	{
		String tempInfo ="";
		
		tempInfo +="Hello, the current tempurature is " + temp;
//		tempInfo += " it is this warm outside... " + temp;
		
		
		if(isCool)
		{
			tempInfo += " its actually cold! ";
		}
		else
		{
			tempInfo += " its considered warm! ";
		}
		
		return tempInfo;
	}
	
	/**
	 * 
	 */
	public int compareTo(Object comparedTemp)
	{
		int compared = 0;
		
		if(this.temp < ((Gui) comparedTemp).getTemp())
		{
			compared = -1;
		}
		else if(this.temp > ((Gui) comparedTemp).getTemp())
		{
			compared = 1;
		}
		return compared;
	}
}
