package homework_5;

import java.util.ArrayList;
import java.util.List;

import homework_4.Employee;
import polymorphism.Food;
import polymorphism.Notebook;
import polymorphism.Product;

	public class ShoppingCart {
		public static void main(String[] args) {
		List<Product> shoppingList = new ArrayList<Product>();
		//實作1..加入二台Notebook跟一個Food至shoppingList中
		//Notebook("Asus",30000), Notebook("Acer",20000), Food("Cookie",200)
		
        Product nb1 = new Product("Acer", 20000);
        Product nb2 = new Product("Asus", 23000);
        Product food = new Product("candy", 100);
        shoppingList.add(nb1);
        shoppingList.add(nb2);
        shoppingList.add(food);
        
        
        //實作2.利用for迴圈，計算shoppingList中的總金額,並印在Console中 
        public static void buy(Product[] ps)
        int sum = 0;
        for (Product product : shoppingList) {
            for (Product product : ps) {
                System.out.println("買入:"+product.ps());
                sum = sum + product.getPrice();
            }
            System.out.println("總金額:"+sum);
        } 
        
        
        //實作3.利用for迴圈，加總shoppingList中是Notebook型態的總金額,並印在Console中
	} 
}
	
	/*  public static void buy(Notebook nb){
    	System.out.println("買入:"+nb.desc());
		}
		public static void buy(Food food){
    	System.out.println("買入:"+food.desc());
		}
		public static void buy(Product p){
    	System.out.println("買入:"+p.desc());
		}
		public static void buy(Product[] ps){
    	int sum = 0;
    	for (Product eachItem : ps) {
        System.out.println("買入:"+eachItem.desc());
        sum = sum + eachItem.getPrice();
    	}
    	System.out.println("總金額:"+sum);
		}*/