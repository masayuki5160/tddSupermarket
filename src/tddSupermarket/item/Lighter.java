package tddSupermarket.item;

import tddSupermarket.item.Item;

public class Lighter implements Item {

	private int price = 100;
	private int count;

	public Lighter(int count) {
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
