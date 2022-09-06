package exception;

public class TestException {

	public static void main(String[] args) {
		try {
			int a = 1;
			int c = 1;
			System.out.println("c="+ c);
			int b = a/c;
			System.out.println("b="+ b);//一樣不會執行
			
			int[] x = {};
			System.out.println(x[0]);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}catch (Exception e) {
			//攔最上層的父類別Exception
			e.printStackTrace();
		}
		finally {
			//關閉檔案或者資料庫連線
			System.out.println("無論錯誤有沒有正確處理,都一定會被執行的程式碼");
		}
		//錯誤有正確被catch處理,會繼續執行
		System.out.println("after try catch");
	}

}
