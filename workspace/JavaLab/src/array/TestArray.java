package array;

import java.util.Iterator;
import java.util.spi.LocaleNameProvider;

public class TestArray {

	public static void main(String[] args) {
		//陣列本身是物件
		int[] ages = new int[10];
		//int[] ages = {1, 2, 3};
		ages[0] = 1;//位置一定都是0起算
		ages[1] = 2;
		ages[2] = 3;
		//[0]...[9]
		
		System.out.printf("第1個=%d%n", ages[0]);
		System.out.printf("長度=%d%n", ages.length);
		//System.out.printf("第4個=%d%n", ages[3]);//預設值0
		
		//ages = null;
		
		//int[][] x = new int[5][4];
		int[][] x = { {1,2,3} , {4,5,6} , {7,8,9} };
		//				第1排		  第2排		第3排
		
		x[0][0] = 1;
		x[1][1] = 2;
		x[2][2] = 3;
		
		System.out.printf("x[%d][%d]=%d%n",2,2,x[2][2]);
		System.out.printf("有%d排%n", x.length);//length沒有刮號,屬性
		System.out.printf("第一排有%d個%n", x[0].length);//length沒有刮號
		
		for(int i = 0; i < x.length; i++){
			//第2排
			for( int j=0 ; j < x[i].length ; j++) {
				System.out.printf("x[%d][%d]=%d%n",i,j,x[i][j]);
			}
		}
		
		int[] nums = {1,2,3,4,5,6};
		//沒有計數器
		//int item = nums[0];
		for(int item : nums) {
			System.out.println(item);
		}
		//int[] item = x[0]
		for(int[] item : x) {
		//? value = item[0]
			for( int value : item ){
				System.out.println(value);
			}
		}
		
		
			
			

	}

}
