package tddSupermarket;

import tddSupermarket.Item;

public class Grape implements Item {

	private int price = 150;
	private int count;

	public Grape(int count) {
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
