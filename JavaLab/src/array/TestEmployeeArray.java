package array;

import java.util.Iterator;

public class TestEmployeeArray {

	public static void main(String[] args) {
		
		Employee[] emps = new Employee[2];
		/*
		Employee emp1 = new Employee();
		emp1.empno = 1;
		emp1.name = "Vincent";
		//放到陣列的第1格
		emps[0] = emp1;
		System.out.println(emps[0].name);//Vincent
		*/
		
		//直接把物件的記憶體位置放到陣列中了(常用做法)
		emps[0] = new Employee();
		emps[0].empno = 1;
		emps[0].name = "Vincent";
		
		Employee emp2 = new Employee();
		emp2.empno = 2;
		emp2.name = "David";
		//放到陣列的第2格
		emps[1] = emp2;
		
		for(int i=0; i < emps.length; i++) {
			System.out.printf("員工編號:%d,姓名:%s%n", emps[i].empno, emps[i].name);
		}
		
		
		
	}

}
