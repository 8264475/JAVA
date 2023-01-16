package homework;

public class season {

	public static void main(String[] args) {
	
	//1.輸入月份1~12月，利用switch判斷相對應的季節春、夏、秋、冬並印出。若不在此範圍則印出”輸入錯誤”
	System.out.print("請輸入月份(1-12): ");
	Scanner sc = new Scanner(System.in);
	int season = sc.nextInt();
	
	switch (season) {
	case 3,4,5:
		System.out.println("春季");		
		break;
	case 6,7,8:
		System.out.println("夏季");		
		break;
	case 9,10,11:
		System.out.println("秋季");		
		break;
	case 12,1,2:
		System.out.println("冬季");		
		break;
	default:
		System.out.println("輸入錯誤");
		break;
	}

	}

}