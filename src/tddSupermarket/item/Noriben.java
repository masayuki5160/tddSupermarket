package tddSupermarket.item;

import tddSupermarket.item.Item;

public class Noriben implements Item {

	private int price = 350;
	private int count;

	public Noriben(int count) {
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
