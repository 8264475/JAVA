package interFace;

import java.util.Date;

public class SimCard extends Product implements Warrantable,Expirable {
	public int warranty;//保固天數
	private Date expireDate;
	@Override
	public int 保固天數() {
		return this.warranty;
	}
	@Override
	public Date 最後期限() {
		return this.expireDate;
	}

	public String desc() {
		String infoFromSuper = super.desc();
		String info = String.format("%s,最後開卡日:%s,使用:%d天", infoFromSuper,expireDate, warranty);
		return info;
	}
	public SimCard(String name, int price, int warranty, Date expireDate) {
		super(name, price);
		this.warranty = warranty;
		this.expireDate = expireDate;
	}
}
