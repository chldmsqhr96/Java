package test.main;
import test.mypac.Weapon;

class MyWeapon2 extends Weapon {
	@Override
	public void attack() {
		System.out.println("공중 공격을 해요");
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		Weapon w1 = new MyWeapon2();
		w1.prepare();
		w1.attack(); // 이 메소드가 공중 공격하도록 프로그래밍 해보세요
	}
}
