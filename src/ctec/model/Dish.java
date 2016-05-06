package ctec.model;

import java.awt.Color;


public class Dish
{

	private int radius;
	private boolean isDirty;
	private Color color;
	
	public Dish(boolean isDirty, Color color, int radius)
	{
		this.color = color;
		this.isDirty = isDirty;
		this.radius = radius;
	}
	
	public int radius()
	{
		return radius;
		
	}
	
	public boolean hasIsDirty()
	{
		return isDirty;
	}
	
	public Color color()
	{
		return color;
	}

	/**
	 * @return the radius
	 */
	public int getRadius()
	{
		return radius;
	}

	/**
	 * @return the isDirty
	 */
	public boolean isDirty()
	{
		return isDirty;
	}

	/**
	 * @return the color
	 */
	public Color getColor()
	{
		return color;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius)
	{
		this.radius = radius;
	}

	/**
	 * @param isDirty the isDirty to set
	 */
	public void setDirty(boolean isDirty)
	{
		this.isDirty = isDirty;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	
	
	
	
	
	
	
	
}
