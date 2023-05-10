package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		List<Member> members = new ArrayList<>();
		
		// Member mem1 = new Member(1, "김구라", "노량진");
		Member mem1 = new Member();
		mem1.num = 1;
		mem1.name = "김구라";
		mem1.addr = "노량진";
		
		Member mem2 = new Member();
		mem2.num = 2;
		mem2.name = "해고올";
		mem2.addr = "행신동";
		
		Member mem3 = new Member();
		mem3.num = 3;
		mem3.name = "원숭이";
		mem3.addr = "역삼동";
		
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);
		
		for (int i = 0; i < members.size(); i ++) {
			Member mem = members.get(i);
			System.out.println("번호: " + mem.num + " / " + "이름: " + mem.name + " / " +
					   		   "주소: " + mem.addr);
		}
		
		for (Member mem : members) {
			System.out.println("번호: " + mem.num + " / " + "이름: " + mem.name + " / " +
							   "주소: " + mem.addr);
		}
		
		members.forEach(new Consumer<>() {
			@Override
			public void accept(Member mem) {
				System.out.println("번호: " + mem.num + " / " + "이름: " + mem.name + " / " +
						   "주소: " + mem.addr);
			}
		});
	}
}