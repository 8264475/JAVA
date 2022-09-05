package equals;

import java.util.Objects;

public class Employee {
		private String id;
		public Employee(String id) {
			this.id = id;
		}
		public boolean equals(Object obj) {//obj=e2
			if (obj instanceof Employee) {
				Employee emp = (Employee) obj;
				return this.id.equals(emp.id);
			}
			return false;//e1.equals(car)
		}
		public int hashCode() {
			return Objects.hash(id);
		}
		public String toString() {
		return String.format("員工(%s)", this.id);
		}
}
