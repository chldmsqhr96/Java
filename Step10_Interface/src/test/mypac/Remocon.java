package test.mypac;

public interface Remocon {
	/*
	 * [Interface]
	 * 
	 * 1. 생성자가 없다
	 * 2. 구현된 메소드를 가질 수 없다.
	 * 3. 필드는 Static final 상수만 가질 수 있다.
	 * 4. Data Type의 역할을 할 수 있다.
	 * 5. Interface type의 참조값이 필요하면 구현(implements) 클래스를 만들어서 객체를 만들어야 한다.
	 * 6. 클래스의 경우 상속이 단일 상속이지만, 인터페이스는 다중 구현이 가능하다.
	 * 7. 인터페이스엔 상속 기능이 없다. 구현과 상속은 엄연히 다르다.
	 */
	
	public static final String COMPANY = "LG"; // static final은 생략할 수 있다.
											   // 선언된 필드는 모두 static final 형태이다.
	public void up();
	public void down();
}