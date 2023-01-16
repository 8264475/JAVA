package equals;

public class TestEquals {

	public static void main(String[] args) {
		Employee e1 = new Employee("001");//0800
		Employee e2 = new Employee("001");//0900
		//System.out.println(e1 == e2);//記憶體位置0800 ==等於 0900?false
		System.out.println(e1.equals(e2));//false
		System.out.println(e1);
		//Car c = new Car("b");
		//System.out.println(e1.hashcode());
		//System.out.println(e1.hashCode());
		//System.out.println(e2.hashCode());
	}
}
