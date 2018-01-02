package tddSupermarket;

import tddSupermarket.Item;

public class TobaccoMenthol implements Item {

	private int price = 440;
	private int count;

	public TobaccoMenthol(int count) {
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
