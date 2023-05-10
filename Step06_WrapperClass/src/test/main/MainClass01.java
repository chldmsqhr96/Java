package test.main;
/*
 * 기본 data type의 참조 data type
 * 
 * byte : Byte
 * short : Short
 * int : Integer
 * long : Long
 * 
 * float : Float
 * double : Double
 * 
 * char : Character
 * boolean : Boolean
 * 
 * 때로는 기본 데이터 type의 참조 데이터 type이 필요할 때가 있다.
 * 기본 데이터 type을 객체에 포장(boxing)하는 형태이다.
 *
 * boxing과 unboxing은 자동으로 되기 때문에 프로그래머가 신경쓸 필욘 없다.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		//기본 데이터 타입 num1
		int num1 = 10;     // stack 영역에 보관
		//참조 데이터 타입 num2
		Integer num2 = 10; // heap 영역에 객체에 10이라는 값이 감싸진 채 보관
		
		//참조 데이터 type이지만 기본 데이터 type처럼 사용할 수 있다.
		int result1 = num2 + 1;
		int result2 = num1 + num2;
		Integer result3 = num1 + num2;
		
		int result4 = Integer.parseInt("123132");
		System.out.println(result4);
	}
}
