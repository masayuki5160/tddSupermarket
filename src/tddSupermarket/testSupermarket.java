package tddSupermarket;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import tddSupermarket.item.*;

@RunWith(Enclosed.class)
public class testSupermarket {

	public static class 商品番号と個数から税込の合計金額を計算する{
		
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
			
			int expected = (int)((100 + 40 * 2) * 1.08);
			assertThat(cart.checkout(), is(expected));
		}
		
		@Test
		public void りんご1個から合計金額を計算する() {
			Apple apple = new Apple(1);
			cart.add(apple);
			
			int expected = (int)(100 * 1.08);
			assertThat(cart.checkout(), is(expected));
		}
		
		@Test
		public void ぶどう・のり弁・しゃけ弁・タバコ・メンソールタバコ・ライター・お茶・コーヒーを1個ずつ購入する() {
			Grape grape = new Grape(1);
			Noriben noriben = new Noriben(1);
			Shakeben shakeben = new Shakeben(1);
			Tobacco tobacco = new Tobacco(1);
			TobaccoMenthol tobaccoMenthol = new TobaccoMenthol(1);
			Lighter lighter = new Lighter(1);
			Tea tea = new Tea(1);
			Coffee coffee = new Coffee(1);
			
			cart.add(grape);
			cart.add(noriben);
			cart.add(shakeben);
			cart.add(tobacco);
			cart.add(tobaccoMenthol);
			cart.add(lighter);
			cart.add(tea);
			cart.add(coffee);
			
			int expected = (int)((150 + 350 + 400 + 100 + 80 + 100) * 1.08) + (420 + 440);// タバコは内税
			assertEquals(expected, cart.checkout());
			assertThat(cart.checkout(), is(expected));
		}
	}
	
	
	public static class タバコの消費税計算処理を考慮する{
		private Cart cart;
		
		@Before
		public void 事前処理() {
			cart = new Cart();
		}
		
		@Test
		public void タバコ1個・メンソールタバコ2個・りんご1個を購入する(){
			Tobacco tobacco = new Tobacco(1);
			TobaccoMenthol tobaccoMenthol = new TobaccoMenthol(2);
			Apple apple = new Apple(1);
			
			cart.add(tobacco);
			cart.add(tobaccoMenthol);
			cart.add(apple);
			
			int expected = (int)(100 * 1.08) + 420 + (440 * 2);// タバコは内税
			assertEquals(expected, cart.checkout());
			assertThat(cart.checkout(), is(expected));
		}
	}
}
