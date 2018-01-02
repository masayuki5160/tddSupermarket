package tddSupermarket.item;

public interface Item {
	public double getPrice();
	public int getCount();
	
	public static double taxRatio = 1.08;
}
