package test.main;
import test.dao.MemberDao;

public class MainClass15 {
	public static void main(String[] args) {
		int num = 22;
		
		MemberDao m = new MemberDao();
		boolean isSuccess = m.delete(num);
		if(isSuccess) {
			System.out.println("삭제 됐습니다.");
		}

	}
}
