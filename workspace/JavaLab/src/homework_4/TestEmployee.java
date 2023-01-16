package homework_4;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee(1, "Vincent", 50000);
		System.out.printf("員工編號:%d", "員工姓名:%s", "薪水:%d%n", emp.getEmpno(), emp.getName(), emp.getSalary());

		Employee emp2 = new Employee(2, "David", 55000);
		System.out.printf("員工編號:%d", "員工姓名:%s", "薪水:%d%n", emp2.getEmpno(), emp2.getName(), emp2.getSalary());
	}

}