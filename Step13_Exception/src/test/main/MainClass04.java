package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		try {
			/*
			 * 실행의 흐름을 쓰레드라고 하는데, 쓰레드를 임의로 5초동안 잡아두기
			 * 컴파일시에 발생하는 Exception(RuntimeException을 상속받지 않은 Exception)
			 * 이 발생하기 때문에 반드시 try~catch 블럭으로 예외 처리를 해야만 한다.
			 */
			Thread.sleep(5000);
		} catch (InterruptedException e) { // 해당 예외는 runtime exception을 상속받지 않기에
										   // 반드시 try-catch문을 의무적으로 사용해야만 한다.
			e.printStackTrace();
		}
		System.out.println("main 메소드가 시작되었습니다.");
	}
}