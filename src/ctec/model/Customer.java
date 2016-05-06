package ctec.model;



public class Customer
{
	private boolean hasOrder;
	private String name;
	private double total;
	
	
	
	
	
	public Customer(boolean hasOrder, String name, double total)
	{
		super();
		this.hasOrder = hasOrder;
		this.name = name;
		this.total = total;
	}
	
	public boolean isHasOrder()
	{
		return hasOrder;
	}
	
	public String name()
	{
		return name;
	}
	
	public double total()
	{
		return total;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @return the total
	 */
	public double getTotal()
	{
		return total;
	}

	/**
	 * @param hasOrder the hasOrder to set
	 */
	public void setHasOrder(boolean hasOrder)
	{
		this.hasOrder = hasOrder;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total)
	{
		this.total = total;
	}
}
