package test.mypac;

/*
 * 클래스 안에서 사용하는 특정 Type을 고정하지 않고
 * 클래스를 사용하는 시점에 Type을 정하게 할 수 있다.
 * 해당 기능을 제네릭이라고 한다.
 *
 * - 아래 선언한 T는 변수 이름 짓듯 사용자 본인이 정할 수 있다.
 *   보통은 Type의 약자인 T를 많이 쓴다.
 * - T를 포괄 클래스(제네릭 클래스)라고 한다.
 */

public class FruitBox<T> {
	private T A;
	
	public void pack(T A) { // 애플 타입의 참조값을 받아서 필드에 대입
		this.A=A; //this a는 private A를 뜻함
		System.out.println("pack");
	}
	public T unpack() { // 애플 타입을 리턴함
		System.out.println("unpack");
		return A;
	}
}