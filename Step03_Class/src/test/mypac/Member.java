package test.mypac;
/*
 * Member 객체 하나에 회원의 번호, 이름, 주소를 담기 위해 Member 클래스를 설계 하려고 함.
 */
public class Member {
	public String name;
	public String addr;
	public int num;
	
	public void mem() {
		System.out.println("번호:"+this.num+" 이름:"+this.name+" 주소:"+this.addr);
	}
}