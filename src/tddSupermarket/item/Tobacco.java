package tddSupermarket.item;

public class Tobacco implements Item {

	private int price = 420;
	private int count;

	public Tobacco(int count) {
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
