package CHAPTER14.EX02_MultiCatch_1;

public class MultiCatch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. ���� try-catch
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
		}
		
		try {
			int num = Integer.parseInt("10A");
		}
		catch(NumberFormatException e) {
			System.out.println("���ڷ� �ٲ� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
		}
		
		// 2. ���� try-catch
		try {
			System.out.println(3/0);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
		catch(NumberFormatException e) {
			System.out.println("���ڷ� �ٲ� �� �����ϴ�");
		}
		finally {
			System.out.println("���α׷� ����");
		}
	}

}
