package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass13 {
	public static void main(String[] args) {
		String name="누구게";
		String addr="어디게";
		
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		MemberDao m = new MemberDao();
		boolean isSuccess = m.insert(dto);
		if(isSuccess) {
			System.out.println("저장 됐습니다.");
		}
	}
}