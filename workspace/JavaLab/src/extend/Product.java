package extend;

public class Product {
	//常數常使用public,static,final這3個
	public static final double TAX = 0.05;
	static {
		//從檔案載入一些一次性設定
		System.out.println("只執行一次");
	}
	
	protected String name;
	protected int price;
	
	//constructor
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Product() {
		
	}
	
	//abstract抽象方法;沒有實作
	//public abstract int calt(int quantity);
	public int getPrice() {
		return price;
	}
	
	//description
	//描述此商品,產生描述商品的文字
	public String desc() {
		String info = String.format("商品名稱:%s,售價:$%d元", name, price);
		return info;
	}
	
	
	//get and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		public void setPrice(int price) {
		this.price = price;
	}
		
		
	}
