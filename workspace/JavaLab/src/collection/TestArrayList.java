package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pack1.Item;

public class TestArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		//3.0物件
		Double d = new Double(3.0);
		//undoxing:取出基本型別的值才能做加減的計算
		//double value = d.doubleValue();
		//list.add(3.0);
		//list.add(new Double(3.0));//boxing
		double aa = d + 1;//unboxing
		//double aa = d.doubleValue() + 1;
		String a = "1";
		int b = Integer.parseInt(a);
		System.out.println(a + 2);
		
		//取得list大小
		System.out.printf("Size=%d%n",list.size());
		//取值get(index),0起算
		System.out.printf("[%d]=%s%n",0,list.get(0));
		System.out.printf("[%d]=%s%n",0,list.get(1));
		System.out.printf("[%d]=%s%n",0,list.get(2));
		System.out.println(list.contains("Hello"));
		
		for (int i=0; i<list.size(); i++) {
			String item = list.get(i);
			Object item = list.get(i);//游標放最前面,再shift+alt+l
			System.out.println(item);
		}
		
		Iterator<String> iterator = list.iterator();
		//偵測游標下方是否有資料
		while ( it.hasNext()) {
			//把資料取出來,next()
			String item = it.next();
			System.out.println(item);//Hello
		}
		//foreach, implements Iterable介面
		System.out.println("----foreach----");
		for( String item : list) {
			System.out.println(item);
		}
	}
}
