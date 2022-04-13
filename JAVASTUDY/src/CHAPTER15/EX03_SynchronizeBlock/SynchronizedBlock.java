package CHAPTER15.EX03_SynchronizeBlock;
 
// ���� ��ü
class MyData{
	int data = 3;
	public void plusData() {
		synchronized (this) {
			int mydata = data;
			try {Thread.sleep(2000);} catch(InterruptedException e) {}
			data = mydata+1;
		}
	}
}

// ���� ��ü�� ����ϴ� ������
class PlusThread extends Thread{
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "���� ��� : " + myData.data);
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ��ü ����
		MyData myData = new MyData();
		
		//plusThread1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThead1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		//plusThread 2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}

}
