package CHAPTER14.EX04_MultiCatch_3;

public class MultiCatch_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. catch ����� ���� ó������ ��
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
		catch(NumberFormatException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
		
		// 2. catch ����� �ϳ��� �������� ��
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException|NumberFormatException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
	}	

}
