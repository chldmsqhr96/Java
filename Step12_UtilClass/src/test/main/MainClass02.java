package test.main;
import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		
		//ArrayList 객체에 10, 20, 30 정수 3개를 담기
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//확장 For문 사용 정수 출력
		for (Integer a : nums) {
			System.out.println(a);
		}
	}
}