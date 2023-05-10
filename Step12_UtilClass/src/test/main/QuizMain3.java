package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain3 {
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우게");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 단어 입력 : ");
		String find = sc.nextLine();
		
		String mean = dic.get(find);
		
		if (mean == null) {
			System.out.println(find + "는 목록에 없습니다.");
		} else {
			System.out.println(find + "의 뜻은 " + mean + "입니다.");
		}		
	}
}
