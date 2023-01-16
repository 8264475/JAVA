package func;
//設計圖
public class People {
	//靜態
	static double overWeightBMI = 24;//常數,屬性
	//靜態方法不能用到物件屬性,因為不需要物件就可以呼叫
	public static double BMI(double h, double w) {
		return w / (h * h);
	}
	
	double height;//屬性
	double weight;
	static double overWeightBmi = 24;//常數,不會變的數字;屬性
	//物件方法
	public double getBMI() {
		//double bmi = weight / (height * height);
		double bmi = People.BMI(height, weight);
		return bmi;
	}
}

