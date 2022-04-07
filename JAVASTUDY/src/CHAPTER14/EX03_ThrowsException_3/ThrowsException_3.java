package CHAPTER14.EX03_ThrowsException_3;

class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);
		} catch(InterruptedException | ClassNotFoundException e) {
			
		}
	}
}

// 2. ���ܸ� ȣ�� �޼���� ������ ��
class B{
	void abc() {
		try {
			bcd();
		} catch(InterruptedException | ClassNotFoundException e) {
			
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}

public class ThrowsException_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
