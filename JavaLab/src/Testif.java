
public class Testif {

	public static void main(String[] args) {

		int age = 30;
		if (age >= 18) {
			System.out.println("成年");
			if (age >= 30) {
				System.out.println("壯年");
			}
		} else {
			System.out.println("未成年");
		}
		// format: ctrl + shift + f

		int classroom = 204;
		switch (classroom) {
		    case 204:
		    	System.out.println("人數大於30人");
		    	break;
		    case 305:
		    	System.out.println("人數小於30大於等於20人");
		    	break;
		    default:
		    	System.out.println("其它");
		    	break;
		}

	}

}
