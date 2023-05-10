package text.mypac;

public class AndroidPhone extends HandPhone {
	public AndroidPhone() {
		System.out.println("AndroidPhone 호출됌");
	}
	public void doInternet() {
		System.out.println("인터넷 연결됌");
	}
	public void showPlatform() {
		System.out.println("안드로이드 운영체제");
	}
	
	public void takePicture() {
		System.out.println("1000만 화소의 사진을 찍어요");
	}
}