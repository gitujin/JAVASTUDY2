package CHAPTER04;

public class SwtichControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break�� ���Ե��� �ʾ��� ��
		int value1 = 2;
		switch(value1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");// ������ �� ��� ����
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");
		}
		System.out.println();
		
		//break�� ���Ե� ���� ��
		int value2 = 2;
		switch(value2) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
		case 4:
			System.out.println("D");
		}
		System.out.println();
		
		//if - else if - else �������� ��ȯ
		if(value1 == 1) {
			System.out.println("A");
		}
		else if(value1 == 2) {
			System.out.println("B"); //������ �� Ż��
		}
		else if(value1 == 3) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}

}
