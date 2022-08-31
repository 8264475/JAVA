
public class TestString {

	public static void main(String[] args) {
		
		String name = "Vincent";//pool
		String name1 = "Vincent";//pool
		System.out.println(name == name1);//問0800==0800->true, 記憶體位置相同
		
		String name2 = new String("Vincent");//heap:0900
		System.out.println(name == name2);//問0800==0900->false
		
		//name = "Vincenta";
		//比較字串時要用equals的方法
		System.out.println(name.equals(name2));//true
		System.out.println("abc中文".length());//5,字的長度
		System.out.println("abc中文".indexOf("bc"));//在位於1找到
						//位置01234
		System.out.println("abc中文".indexOf("bcd"));//-1代表沒找到
		System.out.println("abc中文".contains("bed"));//false,沒找到
		//指定頭的位置-尾,位置都是0起算
		System.out.println("abc中文".substring(2));
		//頭尾都能指定,從第3個到第5個字,但尾巴(第5個字)不算進去
		System.out.println("abc中文".substring(2,4));
		
		double salary = 300.1234;
		//%f->小數, %s->文字; salary(相當於參數)會代入f, .1表取到小數第1位,以此類推
		//"David"->%s, salary->salary, 10->借出%d元
		String message = String.format("%s salary = NT$%.1f, 借出%d元", "David", salary, 10);
		System.out.println(message);
		//%n表換行
		System.out.printf("%s salary = NT$%.1f, 借出%d元%n", "David", salary, 10);
		System.out.println("done");
		//Template->Windows Preferences>Java->Editor->Template
		System.out.printf("%n");

	}

}
