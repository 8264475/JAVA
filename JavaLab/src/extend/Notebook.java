package extend;
//			   子類別			   父類別
public abstract class Notebook extends Product{

	public int warranty;//保固天數
	//實作父類別繼承來的抽象方法
	public int calc(int quantity) {
		return price *quantity;

		//constructor
		this.price = price;
		//setPrice(price);
		this.warranty = warranty;
	}
	
	//override
	public String desc() {
		String infoFromSuper = super.desc();
		//先拿父類別產生的文字(super.desc()),再針對該文字做加工
		String info = String.format("%s,保固%d天", infoFromSuper, warranty);
		return info;
	}
	//getter and setter
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(){
		this.warranty = warranty;
	}
	public Notebook(int warranty) {
	this.warranty = warranty;
	}
	
	}
	
	
