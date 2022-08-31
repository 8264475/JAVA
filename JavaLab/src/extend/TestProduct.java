package extend;

public class TestProduct {

	public static void main(String[] args) {
		final int a;
		a = 2;
		
		Notebook nb = new Notebook("Asus", 30000, 365);
		System.out.printf("名稱:%s,價錢:%d%n", nb.getName(), nb.getPrice());
		System.out.println(nb.name);//要跟Product在同一個package內,不然看不見
		System.out.println(nb.desc());
		
		Product p = new Prosuct("aaa",100);
	}

}
