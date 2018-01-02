package tddSupermarket;

import java.util.*;

import tddSupermarket.item.Item;

public class Cart {

	private Collection<Item> items = new ArrayList<Item>();

	public int checkout() {
		int sum = 0;
		Iterator<Item> iterator = items.iterator();
		while(iterator.hasNext()) {
			Item item = iterator.next();
			sum += item.getPrice() * item.getCount();// TODO Iteratorを使ってる時に他の方法で合計計算できないの？
		}
		return sum;
	}

	public void add(Item item) {
		items.add(item);
	}

}
