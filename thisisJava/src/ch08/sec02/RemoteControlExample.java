package ch08.sec02;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
//		rc 변수에 Television을 대입
		rc = new Television();
		rc.turnOn();
		
//		rc 변수에 Audio 대입
		rc = new Audio();
		rc.turnOn();
		
	}

}
