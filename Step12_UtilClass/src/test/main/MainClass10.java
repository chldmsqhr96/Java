package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		Set<String> names =new HashSet<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주뎅이");
		names.add("덩어리");
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext())	{
			String item = it.next();
			System.out.println(item);
		}
		
		names.forEach((item)->{
			System.out.println(item);
		});
		
		boolean isContain = names.contains("김구라");
		int size = names.size();
		names.remove("해골");
		names.clear();
	}
}
