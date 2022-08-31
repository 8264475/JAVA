package encap;

public class Car {
	
	private String model;
	private int price;
	private String color;
	//建構方法
	public Car(String color) {
		this("Yaris",color);
		//屬性的預設值
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//overloading
	public Car(String model, String color) {
		//this.model = model;
		setModel(model);
		this.color = color;
	}
		
	//設定model屬性的方法
	public void setModel(String model) {
		//把傳入的參數設到屬性上
		//this.會明確指定為屬性
		this.model = model;
	if(model.equals("Prius")) {
			price = 1099000;
			}else if (model.equals("Yaris")) {
				price = 575000;
			}else {
				System.out.println("型號設定有錯");
			}
	}
		/*
		public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}*/
		//取得model屬性值的方法
		public  String getModel() {
		return model;
		
		}
		
		public int getPrice() {
			return price;
		}
}

	