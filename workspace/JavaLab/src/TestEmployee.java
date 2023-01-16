
public class TestEmployee {

	public static void main(String[] args) {
		int	age	= 18;
		Employee emp = new Employee();
		emp.empno = 1;//.->的,屬性
		emp.name = "Vincent";
		System.out.println("編號=" + emp.empno + ",name=" + emp.name);
		
		Employee emp2 = new Employee();
		emp2.empno = 2;
		emp2.name = "David";
		System.out.println("編號=" + emp2.empno + ",name=" +emp2.name );
		
		System.out.println( emp == emp2 );//記憶體位置不同,所以false
		//				   0800 == 0900
		//				   這兩個變數是不是指向同一個物件->true
		
		emp2 = emp;//emp2 = 0800
		System.out.println( emp2.name );//Vincent
		System.out.println( emp == emp2 );//0800 == 0800
		
		emp = null;//清空記憶體位置
		emp2 = null;
		//物件變數一旦成為null,不能呼叫,否則會有錯誤(Exception)發生
		System.out.println( emp2.name );//Vincent
	}
}
