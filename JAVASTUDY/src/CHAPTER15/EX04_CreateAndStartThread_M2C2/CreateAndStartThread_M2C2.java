package CHAPTER15.EX04_CreateAndStartThread_M2C2;

class SMIFileRunnable implements Runnable{
	@Override
	public void run() {
		// 자막 번호 하나 ~ 다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		// 자막 번호 출력
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막 번호) " + strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class VideoFileRunnable implements Runnable{
	@Override
	public void run() {
		// 비디오 프레임 번호 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		// 비디오 프레임 번호 출력
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("(비디오 프레임) " + intArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M2C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SMIRunnable 객체 생성
		Runnable smiFileRunnable = new SMIFileRunnable();
		// smiFileRunnable.start();
		Thread thread1 = new Thread(smiFileRunnable);
		thread1.start();
		// VideoFileRunnable 객체 생성
		Runnable videoFileRunnable = new VideoFileRunnable();
		// videoFileRunnable.start();
		Thread thread2 = new Thread(videoFileRunnable);
		thread2.start();
	}

}
