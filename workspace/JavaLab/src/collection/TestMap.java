package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		//python: Dictionary
		//key-value
		Map<String,Integer> map = new HashMap<>();
		map.put("John", 2000);//放值
		map.put("David", 1000);
		map.put("Tom", 5000);
		map.put("Tom", 2000);//一樣的key(Tom),所以value會後蓋前

		//取得:get(key)
		System.out.println("Tom's salary = "+map.get("Tom"));
		//取得所有的key,包裝成Set
		Set<String> keys = map.keySet();
		//keys: John, David, Tom
		Iterator<String> it = keys.iterator();//透過Iterator處理所有的key
		//利用Iterator處理所有的key
		int sum = 0;
		while (it.hasNext()) {
			String key = it.next();
			System.out.printf("key=%s,value=%s%n",key,map.get(key));
			Integer salary = (Integer)map.get(key);//Object
			sum = sum + salary.intValue();
			//salary是物件(Integer),unboxing轉成int才能做加減
		}
		System.out.printf("總合=%d%n",sum);
	}
}
