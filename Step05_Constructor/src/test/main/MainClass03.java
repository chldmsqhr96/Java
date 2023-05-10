package test.main;
import test.mypac.MacBook;
import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		// 즉석으로 만들어서 전달
		MacBook mac1 = new MacBook(new Cpu(), new Memory(), new HardDisk());
		MacBook mac2 = new MacBook(null, null, null);
		mac1.doGame();
		mac2.doGame();
		
		Cpu c = new Cpu();
		Memory m = new Memory();
		HardDisk h = new HardDisk();
		// 이미 만들어진 값을 참조해서 전달
		MacBook mac3 = new MacBook(c, m, h);
	}
}