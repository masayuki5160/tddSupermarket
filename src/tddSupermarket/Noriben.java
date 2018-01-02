package tddSupermarket;

import tddSupermarket.Item;

public class Noriben implements Item {

	private int price = 350;
	private int count;

	public Noriben(int count) {
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
