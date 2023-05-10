package test.main;

public class MainClass07 {
	public static int num = 999;
	public static void main(String[] args) {

		// 같은 클래스 안에 속해 있음으로 클래스명 생략가능
		int result=num+1; // MainClass07.num + 1; => num+1;
		System.out.println(result);
		
		test();
	}
	
	public static void test() {
		System.out.println("test() 메소드 호출되었음");
	}
}