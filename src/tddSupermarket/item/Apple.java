package tddSupermarket.item;

public class Apple implements Item {

	private int price = 100;
	private int count;

	public Apple(int count) {
		this.count = count;
	}

	@Override
	public double getPrice() {
		return price * taxRatio;
	}

	@Override
	public int getCount() {
		return count;
	}

}
