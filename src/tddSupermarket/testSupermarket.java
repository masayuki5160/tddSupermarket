package tddSupermarket;

import static org.junit.Assert.*;
import org.junit.Test;

public class testSupermarket {

	@Test
	public void 商品番号と個数から合計金額を計算する() {
		Apple apple = new Apple(1);
		Mikan mikan = new Mikan(2);
		
		Cart cart = new Cart();
		cart.add(apple);
		cart.add(mikan);
		
		int sum = cart.checkout();
		
		assertEquals(100 + 40 * 2, sum);
	}

}
