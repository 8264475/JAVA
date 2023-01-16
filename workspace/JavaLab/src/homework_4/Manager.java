package homework_4;

public class Manager extends Employee{
		
	private long bonus; //分紅
	public Manager(int empno, String name, long salary, long bonus) {
		super(empno, name, salary);
		this.bonus = bonus;
		}
				
		public long getBonus() {
			return this.bonus;
		}
		/*public long getSalary() {
			return salary;*/
		}