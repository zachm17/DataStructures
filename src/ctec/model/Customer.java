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
}
