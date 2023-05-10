package test.main;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 *  세 명의 회원 정보를 HashMap 객체에 각각 담아서
		 *  
		 *  ArrayList에 누적시켜 보세요
		 *  
		 *  반복문을 돌면서 ArrayList에 누적된 회원정보를 콘슬창에 순서대로 출력해보세요
		 */
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("addr", "노량진");
		
		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "해골");
		map2.put("addr", "행신동");
		
		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "원숭이");
		map3.put("addr", "역삼동");
		
		List<HashMap<String, Object>> memList = new ArrayList<>();
		memList.add(map1);
		memList.add(map2);
		memList.add(map3);
		
		for(HashMap<String, Object> mem : memList) {
			int num = (int)mem.get("num");
			String name = (String)mem.get("name");
			String addr = (String)mem.get("addr");
			System.out.println(num + " " + name + " " +addr);
		}
		
		for (int i = 0; i < memList.size(); i++) {
			HashMap<String, Object> mem = new HashMap<>();
			mem = memList.get(i);
			int num = (int)mem.get("num");
			String name = (String)mem.get("name");
			String addr = (String)mem.get("addr");
			System.out.println(num + " " + name + " " +addr);
		}
	}
}
