package tddSupermarket;

import tddSupermarket.Item;

public class Coffee implements Item {

	private int price = 100;
	private int count;

	public Coffee(int count) {
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
