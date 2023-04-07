package newp;
public class converter
{
	public static int dollar2inr(int a)
	{
		return a*73;
	}
	public static int euro2inr(int a)
	{
		return a*86;
	}
	public static double yen2inr(int a)
	{
		return a*0.67;
	}
	public static double inr2dollar(int a)
	{
		return a*0.014;
	}
	public static double inr2euro(int a)
	{
		return a*0.012;
	}
	public static double inr2yen(int a)
	{
		return a*1.5;
	}
	public static double meter2km(int a)
	{
		return a*0.001;
	}
	public static double miles2km(int a)
	{
		return a*1.60934;
	}
	public static double km2meter(int a)
	{
		return a*1000;
	}
	public static double km2miles(int a)
	{
		return a*0.621371;
	}
	public static double min2hrs(int a)
	{
		return a*0.0166667;
	}
	public static double sec2hrs(int a)
	{
		return a*0.0166667;
	}
	public static double hrs2min(int a)
	{
		return a*60;
	}
	public static double hrs2sec(int a)
	{
		return a*3600;
	}
}
