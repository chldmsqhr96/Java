package test.main;
import java.util.ArrayList;

/*
 * - 자바에서 배열은 크기를 조절할 수 없는 고정 배열이다.
 * - 따라서 동적으로 item을 추가하고 삭제하는 작업을 하려면 일반 배열은 사용할 수 없다.
 * - 그래서 해당 작업을 하기 위해선 ArrayList 객체를 사용한다.
 */

public class MainClass01 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		String item = names.get(0);
		
		System.out.println(names);
		
		names.remove(1);
		
		names.set(0, "에이콘");
		
		System.out.println(names.size());
		
		System.out.println(names);
		
		names.removeAll(names);
		
		System.out.println(names.size());
		
		names.clear();
	}
}
