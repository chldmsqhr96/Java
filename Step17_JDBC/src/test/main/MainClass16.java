package test.main;

import java.util.List;
import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass16 {
	public static void main(String[] args) {
		List<MemberDto> list = new MemberDao().getList();
		
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum() + " | " + tmp.getName() + " | " + tmp.getAddr());
		}
	}
}