import java.util.Iterator;

import org.w3c.dom.ls.LSOutput;

public class Testfor {

	public static void main(String[] args) {
		int sum = 0;//累計值
		for ( int i = 1 ; i <= 100 ; i++ ) { //(計數器宣告(只會執行1次);執行條件;次數控制);i++數器加1
			if ( i%2 == 0) {
				continue;//跳過這次迴圈執行, -> i++
			}
			if ( i>= 50 ) {
				break;
			}
			System.out.println(i);
			sum = sum + i;
			//i=1, sum=0+1=1
			//i=2, sum=1+2=3
			//i=3, sum=3+3=6
		}
		System.out.println("總合=" + sum);
		
		//while
		int i = 0;
		int sumOfWhile = 0 ;
		while( i <= 100 ){
			sumOfWhile += i;//sumOfWhile = sum1 + i
			i++;//無窮迴圈
		System.out.println( "Sum of While=" + sumOfWhile );
		}
		
		i = 0;//給值,不能重覆宣告
		sum = 0;//給值,不能重覆宣告
		do {
			sum += i ;
			i++;	
		}while ( i <= 100 );
		System.out.println( "Sum of Do While=" + sum );
		
		//取亂數,一直大於5
		double random;
		do {		//0-1
			random = Math.random() *10;
			System.out.println(random);
		}while ( random < 5 );
	}		
		
}
		
		
