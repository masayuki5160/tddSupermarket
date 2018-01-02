package tddSupermarket;

import tddSupermarket.Item;

public class Tea implements Item {

	private int price = 80;
	private int count;

	public Tea(int count) {
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
