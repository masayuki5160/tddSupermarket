package tddSupermarket;

import tddSupermarket.Item;

public class Shakeben implements Item {

	private int price = 400;
	private int count;

	public Shakeben(int count) {
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
