
public class TastBasic {

	public static void main(String[] args) {
// 宣告	型態  變數名稱
		long salary; 
		salary = 20000; //給值
		//long salary = 20000; //宣告同時給值
		
		//sysout, key sout最快, ctrl + F11執行
		System.out.println("salary = "+ salary);
		
		//long salary;
		long salaryOfMary = 2147483647;
		System.out.println(salaryOfMary);
		
        //4 byte int, +-21e, overflow
		long i =2100000000L + 2100000000;
		System.out.println(i);
		//42e沒有L: int + int -> int, overflow
		//long + long -> long 42e不會造成overflow
		
		//rename: alt + shift + r
		char ch = '中';//字元,單一個字,不能是多個字,多個字是用""
		System.out.println(ch);
		
		//8種基本型別: 4整數,2小數 float,double,char,boolean
		boolean paid = true;//true or false
		System.out.println(paid);
		
		//跳脫字元
		System.out.println("Wor\r\nld");
		//"Hello":加\反斜線就顯示得出來
		System.out.println("\"Hello\"");
		//World:加\r\n可以換行
		System.out.println("Hello \r\nWorld");
		//路徑c:\java:多加一個\反斜線
		System.out.println("c:\\java");
		
		double aa = 10.5;//double
		int y = (int)aa;//正常情形下等號右邊會比較大,用這個可以大轉小, int < double, casting強制轉型
		System.out.println(y);
		
		int age = 20;//一定要測: 等於==, 不等於!=	
		boolean adult = (age < 18 | age >30);
		System.out.println("成年?"+adult); 
		
		System.out.println(12 & 6);//4
		//Copy: ctrl + alt + down
		System.out.println( 12 | 6);//14
	
		System.out.println(2 << 2);//2*2^1=8
		
		age++;//20 -> 21, ++, --
		System.out.println("age = " + age);//age = 21
		System.out.println("age = " + (++age));//age = 22
		System.out.println("age1 = " + age);//age1 = 22
		
		float a = 10;
		int b = 3;
		float c = a / b;//一定要練習做, 除/, %(對2取餘數,判斷奇偶數)
		System.out.println(c);
		a += b;//a = a(float)+b(int)
		//若a =(int)(a + b);加(int)是為了強制轉型
		System.out.println("a="+a);
		
		//>=30壯年
		System.out.println( age>=18 ? (age>=30?"壯年":"成年"): "未成年");
		
		{
		int sales = 2000;
		int salary1 = 100;
		salary1 = ( sales > 1000? salary1 + 10 : salary1 - 10);
		System.out.println("薪水="+ salary1);
		}
		
	}

}
