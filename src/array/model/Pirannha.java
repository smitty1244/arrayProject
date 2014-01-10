package array.model;

public class Pirannha
{
	private int teeth;
	private int spots;
	private boolean fire;
	
	public Pirannha()
	{
		teeth = 10;
		spots = 10;
		fire = false;
	}

	public int getTeeth()
	{
		return teeth;
	}

	public int getSpots()
	{
		return spots;
	}

	public boolean isFire()
	{
		return fire;
	}

	public void setTeeth(int teeth)
	{
		this.teeth = teeth;
	}

	public void setSpots(int spots)
	{
		this.spots = spots;
	}

	public void setFire(boolean fire)
	{
		this.fire = fire;
	}
}
