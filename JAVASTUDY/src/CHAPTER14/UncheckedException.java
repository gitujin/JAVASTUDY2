package CHAPTER14;

class A {}
class B extends A {}

public class UncheckedException {

	public static void main(String[] args) {
		// UncheckedException = RunTimeException(실행 예외)
		
		// 1. ArithmeticException - 연산 불가능
		System.out.println(3/0);
		
		// 2. ClassCastException - 다운 캐스팅이 불가능
		A a = new A();
		B b = (B)a;
		
		// 3. ArrayIndexOutOfBoundException - 배열 인덱스 잘못 사용
		int[] array = {1, 2, 3};
		System.out.println(array[3]);
		
		// 4. NumberFormatException - 문자열이 정수가 아닐때
		int num = Integer.parseInt("10!");
		
		// 5. NullPointerException - null값 출력
		String str = null;
		System.out.println(str.charAt(2));

	}

}
