package interFace;

public interface Warrantable {
	
	int 保固天數();
	//系統常數(static)允許的,物件屬性是不允許的
	//public static final是預設值,可以不寫
	/*public static final*/ int MAX_WARRANTY = 365;
	//JDK8多的功能
	//default,子類別繼承後可以override
	default int 檢測費用() {
		return 500;		
	}
	//static表靜態方法,綁在介面上
	static int 運費() {
		return 500;
	}
}
