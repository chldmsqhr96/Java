package test.study;

import java.util.List;
import test.dao.MemberDao;
import test.dto.MemberDto;

public class Study {
	public static void main(String[] args) {
		List<MemberDto> list = new MemberDao().getList();
		
		for(MemberDto tmp:list) {
			tmp.getNum();
			tmp.getName();
			tmp.getAddr();
		}
	}
}