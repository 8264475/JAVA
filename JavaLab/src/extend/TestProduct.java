package extend;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestProduct {

		public static void main(String[] args) {
		// 常數常使用public static final

		Notebook nb = new Notebook("Asus", 30000, 365);

		System.out.printf("名稱:%s,價錢:%d%n", nb.getName(), nb.getPrice());
		System.out.println(nb.name);// 要跟Product在同一個package內,不然看不見
		System.out.println(nb.price);
		System.out.println(nb.desc());// 同一個package

		Product item = nb;//Notebook是Product的一種嗎?是
		System.out.println(item.desc());
		Notebook item2 = (Notebook)item;//Product是Notebook的一種嗎?不一定,不保證是
		//工程師保證可以轉成Notebook,強制轉型+(Notebook)
		if (item instanceof Food) {
			//如果item有Food型態,才做強制轉型,避免發生轉錯的問題,是一種檢查的機制
			Food item3 = (Food)item;//Product是Food的一種嗎?
		}
		//System.out.println(item.getWarranty());
		//					Product.desc
		//2022.9.5, 日曆->java.util.Date
		GregorianCalendar calendar = new GregorianCalendar(2022,Calendar.SEPTEMBER,5);
		//getTime()可以取得到Date物件,Date物件是calendar程式幫你產生在heap區
		Date expDate = calendar.getTime();
		Food f = new Food("肉圓", 50, expDate);
		System.out.println(f.desc());
		//一籃子商品
		Product[] ps = {nb, f};
		buy(ps);
		}
		//Notebook跟Food都是Product,所以用父類別型態做就好
		public static void buy(Product[] items) {
			int sum = 0;
			for(int i = 0; i < items.length; i++) {
				Product p = items[i];
				System.out.println("買入:" + p.desc());
				sum += p.getPrice();
			}
			System.out.printf("總金額:%d%n", sum);
		}
}
