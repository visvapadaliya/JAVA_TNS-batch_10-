package geometry;

public class Rectangle 
{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}

	public double getArea()
	{
		return length*width;
	}
	
	public double getParameter()
	{
		return 2 * (length + width);
	}
}
