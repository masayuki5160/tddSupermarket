package tddSupermarket.item;

import tddSupermarket.item.Item;

public class Grape implements Item {

	private int price = 150;
	private int count;

	public Grape(int count) {
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
