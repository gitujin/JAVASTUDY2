package CHAPTER04;

public class OverlappedControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if-if �ߺ�
		int value1 = 5;
		int value2 = 3;
		if(value1 > 5) {
			if(value2 > 2) {
				System.out.println("����1");
			}
			else {
				System.out.println("����2");
			}
		}
		else {
			System.out.println("����3");
		}
		System.out.println();
		
		//switch-for �ߺ�
		int value3 = 2;
		switch(value3) {
		case 1:
			for(int k = 0; k < 10; k++) {
				System.out.print(k + " ");
			}
			break;
		case 2:
			for(int k = 0; k < 10; k++) {
				System.out.print(k + " ");
			}
			break;
		}
		System.out.println();
		System.out.println();
		
		//for-for-if �ߺ�
		for(int i = 0; i < 3; i++) { //3ȸ �ݺ�
			for(int j = 0; j < 5; j++) {
				System.out.println(i + " " + j);
				if(i == j) {
					System.out.println("i = j");
				}
			}
		}
	}
}