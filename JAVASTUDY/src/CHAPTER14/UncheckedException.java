package CHAPTER14;

class A {}
class B extends A {}

public class UncheckedException {

	public static void main(String[] args) {
		// UncheckedException = RunTimeException(���� ����)
		
		// 1. ArithmeticException - ���� �Ұ���
		System.out.println(3/0);
		
		// 2. ClassCastException - �ٿ� ĳ������ �Ұ���
		A a = new A();
		B b = (B)a;
		
		// 3. ArrayIndexOutOfBoundException - �迭 �ε��� �߸� ���
		int[] array = {1, 2, 3};
		System.out.println(array[3]);
		
		// 4. NumberFormatException - ���ڿ��� ������ �ƴҶ�
		int num = Integer.parseInt("10!");
		
		// 5. NullPointerException - null�� ���
		String str = null;
		System.out.println(str.charAt(2));

	}

}
