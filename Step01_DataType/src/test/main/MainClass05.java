
package test.main;
/*
 * 참조 데이터 타입
 * String type
 * - 문자열을 다룰 때 사용하는 Data type
 */
public class MainClass05 {
	public static void main(String[] args) {
		// 김구라라는 String Type의 객체를 heap영역에 만들고 참조값을 변수에 담기
		String name = "김구라";
		// name 안에 있는 참조 값을 변수 tmp에 복사해주기
		String tmp = name;
		// 원숭이라는 String Type 객체를 heap 영역에 만들고 그 참조값을 name에 덮어 씌우기
		name = "원숭이";
		// name 변수를 비우기 (null은 참조 데이터 type이 담길 수 있는 빈 공간을 의미함)
		name = null;
		System.out.println(name);
		System.out.println(tmp);
	}
}
