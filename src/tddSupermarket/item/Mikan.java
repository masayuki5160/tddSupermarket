package tddSupermarket.item;

import tddSupermarket.item.Item;

public class Mikan implements Item {
	
	private int price = 40;
	private int count;

	public Mikan(int count) {
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
