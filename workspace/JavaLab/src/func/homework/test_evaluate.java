package homework;

public class test_evaluate {

	public static void main(String[] args) {
	
	System.out.print("請輸入年度考績(優、甲、乙、丙): ");
	
	Scanner sc = new Scanner(System.in);
	
	String grade = sc.next();
	
	switch (grade) {
	case "優":
		System.out.println("出國去玩");
		break;
	case "甲":
		System.out.println("買手機");
		break;
	case "乙":
		System.out.println("去逛街");
		break;
	case "丙":
		System.out.println("找工作");
		break;
		}

	}

}
