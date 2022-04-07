package CHAPTER14.EX01_ThrowsException_1;

class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			
		}
	}
}

// 2. 예외를 호출 메서드로 전가할 때
class B{
	void abc() {
		try {
			bcd();
		} catch(InterruptedException e) {
			//예외 처리 구문
		}
	}
	void bcd() throws InterruptedException {
		Thread.sleep(1000);
	}
}
public class ThrowsException_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
