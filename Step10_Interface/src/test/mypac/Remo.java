package test.mypac;

public class Remo implements Remocon {

	@Override
	public void up() {
		System.out.println("볼륨업");
	}

	@Override
	public void down() {
		System.out.println("볼륨다운");
	}
	
	public void reserve() {
		System.out.println("전원 off를 예약합니다.");
	}

}
