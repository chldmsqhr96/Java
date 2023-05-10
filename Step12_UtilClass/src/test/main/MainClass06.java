package test.main;
import java.util.HashMap;
import java.util.Map;
import test.mypac.Car;

/*
 * - Java에서 어떤 데이터를 key:value의 쌍으로 관리하고 싶은 경우 HashMap 객체를 쓴다.
 * 
 * - key의 Generic은 마음대로 지정할 수 있지만, 일반적으로 String을 사용한다.
 * 
 * - Value의 경우 일반적으로 Object를 사용한다.
 * 
 */

public class MainClass06 {
	public static void main(String[] args) {
		Map<String, Object> map1 = new HashMap<>();
		map1.put("num", 1); // Integer Type 담기
		map1.put("name", "김구라"); // String Type 담기
		map1.put("isMan", true); // Boolean Type 담기
		map1.put("car", new Car("소나타")); // Class Type 담기
		
		int num = (int)map1.get("num");
		String name = (String)map1.get("name");
		boolean gender = (boolean)map1.get("isMan");
		
		System.out.println(num + " " + name + " " + gender);
		System.out.println(map1.size());
	}
}
