
public class func {

	public static void main(String[] args) {
		int s = add(1,2);//Debug->F5;
		//可以拿回傳的結果做進一步的計算
		System.out.println(s%2==1?"奇數":"偶數");
	}
	//方法的定義
	//void表沒有回傳結果;add表方法名字;a、b表參數,輸入,input
	//int表回傳的型態是int,搭配reutrn回傳
	public static int add(int a, int b) {
		//大刮號內:方法實做
		int sum = a + b;//Debug->F6
		System.out.printf("sum=%d%n",sum);
		return sum;
	}

}
