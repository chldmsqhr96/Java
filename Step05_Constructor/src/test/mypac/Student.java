package test.mypac;
/*
 * 생성자
 * 
 * 1. 클래스명과 동일
 * 2. 메소드 모양과 유사하지만 리턴이 없다.
 * 3. 객체를 생성할 때 호출된다.
 * 4. 객체를 생성하는 시점에 무언가 준비 작업할 때 유용하다.
 * 5. 생성자를 명시적으로 정의하지 않아도 기본적으로 있다고 간주된다.
 */
public class Student {
	public Student() {
		// 객체를 생성하는 시점에 무언가를 하고 싶다면 여기서 작업
		System.out.println("공부를 준비합니다");
	}
	public void study() {
		System.out.println("공부해요");
	}
}
