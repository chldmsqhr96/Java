package test.mypac;
/*
 * 새로은 쓰레드 만드는 법2
 * 
 * 1. Runnable 인터페이스를 구현한 클래스를 정의
 * 2. run() 메소드를 강제 오버라이드
 * 3. Thread 클래스로 객체를 생성하면서 해당 클래스로 만든 객체를 생성자의 인자로 전달
 * 4. Thread 클래스로 만든 객체의 start() 메소드를 호출해서 스레드를 시작시킴
 */

public class CountRunnable implements Runnable{
	@Override
	public void run() {
		int count = 10;
		while(true) {
			System.out.println("현재 count : " + count);
			if(count==0) {
				break;
			}
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			count--;
		}
	}
}
