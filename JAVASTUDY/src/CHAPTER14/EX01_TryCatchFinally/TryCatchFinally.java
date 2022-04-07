package CHAPTER14.EX01_TryCatchFinally;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. try-catch
		try {
			System.out.println(3/0); //���� ����(ArithmeticException)
			System.out.println("���α׷� ����");
		}
		catch(ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
			System.out.println("���α׷� ����");
		}
		
		// 2. try-catch-finally
		try {
			System.out.println(3/0); //���� ����
		}
		catch(ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
		}
	}

}
