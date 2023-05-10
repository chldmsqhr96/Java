package test.main;

public class MainClass04 {
	
	public static class Gura { // Inner Class
		public void say() {
			System.out.println("안녕 난 구라야");
		}
	}
	
	public static void main(String[] args) {
		Gura g = new Gura();
		g.say();
		
	/*
	 * 메소드 안에도 클래스를 정의할 수 있다.
	 * 메소드 안에 정의한 클래스를 지역 내부(Local Inner) 클래스라고 한다.
	 * 메소드 내부에서만 사용할 수 있다.
	 */
		
		class Cat {
			public void say() {
				System.out.println("야옹");
			}
		}
		
		Cat c1 = new Cat();
		c1.say();
	}
}
