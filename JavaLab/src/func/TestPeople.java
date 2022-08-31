package func;

public class TestPeople {

	public static void main(String[] args) {
		People p = new People();
		p.height = 1.7;
		p.weight = 70;
		double bmi = p.getBMI();//shift+alt+L
		System.out.printf("BMI=%.1f%n",bmi);
		System.out.println(Math.pow(2,10));
		//static靜態屬性
		System.out.printf("OverWeightBMI = %.0f%n", People.overWeightBmi);
		System.out.printf("Static BMI=%.1f%n", People.BMI(1.8, 100));
		System.out.println(Math.pow(1.5, 2));
		System.out.println(Math.sqrt(4));
		
		}
	}
