package tddSupermarket.item;

import tddSupermarket.item.Item;

public class Mikan implements Item {
	
	private int price = 40;
	private int count;

	public Mikan(int count) {
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
