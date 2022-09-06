import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		//不重覆
		Set<String> set = new HashSet<>();
		//Set set = new LinkedHashSet()
		set.add("Hello");
		System.out.printf("size=%n",set.size());
		
		boolean success = set.add("Hello");
		System.out.printf("加重覆,成功?%s%n",success);
		System.out.printf("size=%d%n",set.size());
		System.out.println(set.contains("Hello"));
		
		set.add("World");
		//set.add(3.0);
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String item = it.next();
			System.out.println(item);
			
		}

	}

}
