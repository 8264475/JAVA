package exception;

import java.util.HashSet;
import java.util.Set;
import equals.Employee;

public class TestEmployeeSet {

	public static void main(String[] args) {

		Employee e1 = new Employee("001");
		Employee e2 = new Employee("001");
		Set set = new HashSet();
		set.add(e1);
		set.add(e2);//false
		System.out.printf("size=%d%n",set.size());
		
	}

}
