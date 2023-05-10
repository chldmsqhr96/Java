package test.mypac;

public class MacBook {
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		this.cpu = cpu;
		this.memory = memory;
		this.hardDisk = hardDisk;
	}
	
	public void doGame() {
		if(this.cpu == null || memory == null || hardDisk == null) {
			System.out.println("실행이 안되요");
			return;
		}
		System.out.println("게임을 해요");
	}
}