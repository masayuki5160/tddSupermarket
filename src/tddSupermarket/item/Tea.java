package tddSupermarket.item;

import tddSupermarket.item.Item;

public class Tea implements Item {

	private int price = 80;
	private int count;

	public Tea(int count) {
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
