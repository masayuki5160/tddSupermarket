package tddSupermarket.item;

public class Apple implements Item {

	private int price = 100;
	private int count;

	public Apple(int count) {
		this.count = count;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public int getCount() {
		return count;
	}

}
