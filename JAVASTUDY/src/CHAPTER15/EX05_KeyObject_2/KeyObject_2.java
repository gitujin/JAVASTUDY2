package CHAPTER15.EX05_KeyObject_2;

class MyData{
	synchronized void abc() {
		for(int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
	synchronized void bcd() {
		for(int i = 0; i < 3; i++) {
			System.out.println(i + "��");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
	void cde() {
		synchronized(new Object()) {
			for(int i = 0; i<3; i++) {
				System.out.println(i + "��°");
				try {Thread.sleep(1000);} catch(InterruptedException e) {}
			}
		}
	}
}

public class KeyObject_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ��ü
		MyData myData = new MyData();
		// 3���� �����尡 ������ �޼��� ȣ��
		new Thread() {
			public void run() {
				myData.abc();
			};
		}.start();
		new Thread() {
			public void run() {
				myData.bcd();
			}
		}.start();
		new Thread() {
			public void run() {
				myData.cde();
			}
		}.start();
	}
}