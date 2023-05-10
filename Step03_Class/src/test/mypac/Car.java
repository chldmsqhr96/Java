package test.mypac;
/*
 * class의 역할
 * 1. 객체의 설계도 역할
 *  - heap 영역에 들어있는 물건
 *  - class를 이용해서 객체를 원하는 시점에 원하는 개수만큼 만들 수 있다.
 *  - 만들어진 객체가 어떤 저장소와 어떤 기능을 가지게 할 지 class로 설계할 수 있다.
 * 2. data type 역할
 * 	-
 *	-
 * 3. static 필드와 메소드를 포함하는 역할
 */
public class Car {
/*
 * 필드(저장소) 정의
 * - 클래스의 {} 중괄호 안에 아래와 같은 형식으로 필드를 정의할 수 있다.
 * - 초기 값을 부여하지 않으면 기본 값이 들어간다.
 * - int의 기본 값은 0, boolean의 기본 값은 false, 참조데이터 type의 기본 값은 null 
 * 
 *  접근지정자 data type 필드명 =     초기값;
 * (public등) (int등) (변수명) = (안넣으면 기본값);
 */
	public String name;
	public int price;

/*
 * 메소드(기능) 정의
 * - 접근지정자  data type 메소드명() {안에 내용}
 *  (public등) (돌려줄타입)
 * - data type은 정수를 돌려줄 때는 int, 실수는 double, 안돌려줄거면 void로 선언
 * - 자바스크립트의 function과 선언 방식이 비슷함
 */
	public void drive() {
		System.out.println(this.name + "가(이) 달려요");
	}
	
	public void showInfo() {
		System.out.println("차의 이름은 " + this.name + "이고"
							+ " 가격은 "+ this.price + "만원 입니다.");
	}
}