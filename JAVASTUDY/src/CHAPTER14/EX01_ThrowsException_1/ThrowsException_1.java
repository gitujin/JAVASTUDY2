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

// 2. ���ܸ� ȣ�� �޼���� ������ ��
class B{
	void abc() {
		try {
			bcd();
		} catch(InterruptedException e) {
			//���� ó�� ����
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
