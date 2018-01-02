package tddSupermarket.item;

import tddSupermarket.item.Item;

public class Coffee implements Item {

	private int price = 100;
	private int count;

	public Coffee(int count) {
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
