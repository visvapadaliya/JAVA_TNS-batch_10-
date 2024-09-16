package geometry;

public class Circle 
{
	private double radius;

	public Circle(double radius) 
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	
	public double getParameter()
	{
		return 2* Math.PI*radius;
	}	
}
