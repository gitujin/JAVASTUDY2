package CHAPTER15.EX07_Waiting_WaitNotify_2;

class DataBox{
	boolean isEmpty = true;
	int data;
	synchronized void inputData(int data) {
		if(!isEmpty) {
			try {wait();} catch(InterruptedException e) {}
		}
		this.data = data;
		isEmpty = false;
		System.out.println("�Է� ������ : " + data);
		notify();
	}
	synchronized void outputData(int data) {
		if(isEmpty) {
			try {wait();} catch(InterruptedException e) {}
		}
		isEmpty = true;
		System.out.println("��� ������ : " + data);
		notify();
	}
}

public class Waiting_WaitNotify_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBox dataBox = new DataBox();
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 9; i++) {
					dataBox.inputData(i);
				}
			};
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 9; i++) {
					dataBox.outputData(i);
				}
			};
		};
		t1.start();
		t2.start();
	}

}
