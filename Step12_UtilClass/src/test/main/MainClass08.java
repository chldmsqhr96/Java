package test.main;
import java.util.HashSet;
import java.util.Set;

/*
 * HashSet은 Set 인터페이스를 구현한 클래스이다.
 * 
 * [특징]
 * 
 * - 순서가 없음
 * - key값도 없음
 * - 중복 허용 안함
 * - data를 묶음으로 관리하고자 할 때 사용
 * 
 */

public class MainClass08 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(11);
		set1.add(12);
		set1.add(13);
		set1.add(10);
		
		Set<String> set2 = new HashSet<>();
		set2.add("kim");
		set2.add("park");
		set2.add("lee");
		set2.add("kim");
		set2.add("park");
		
		System.out.println(set1);
		System.out.println(set2);
	}
}
