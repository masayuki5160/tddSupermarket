package tddSupermarket;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class testSupermarket {

	public static class 商品番号と個数から合計金額を計算する{
		
		private Cart cart;
		
		@Before
		public void 事前処理() {
			cart = new Cart();
		}
		
		@Test
		public void りんご1個みかん2個から合計金額を計算する() {
			Apple apple = new Apple(1);
			Mikan mikan = new Mikan(2);
			
			cart.add(apple);
			cart.add(mikan);
			
			int sum = cart.checkout();
			
			assertEquals(100 + 40 * 2, sum);
		}
		
		@Test
		public void りんご1個から合計金額を計算する() {
			Apple apple = new Apple(1);
			
			cart.add(apple);
			
			int sum = cart.checkout();
			assertEquals(100 , sum);
		}
	}

}
