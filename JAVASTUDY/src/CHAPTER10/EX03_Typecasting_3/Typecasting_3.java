package CHAPTER10.EX03_Typecasting_3;

/* ĳ������ ���� ���θ� Ȯ���� �� �ִ� instanceof */

class A {}
class B extends A {}

public class Typecasting_3 {

	public static void main(String[] args) {
		// instanceof
		A aa = new A();
		B ab = new B();
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);
		
		if(aa instanceof B) {
			B b = (B) aa;
			System.out.println("aa�� B�� ĳ�����߽��ϴ�.");
		}else {
			System.out.println("aa�� B Ÿ������ ĳ������ �Ұ���!!!!");
		}
		if(ab instanceof B) {
			B b = (B) ab;
			System.out.println("ab�� B�� ĳ�����߽��ϴ�.");
		}else {
			System.out.println("ab�� B Ÿ������ ĳ������ �Ұ���!!!!");
		}
		if("�ȳ�" instanceof String) {
			System.out.println("\"�ȳ�\"��  String Ŭ���� �Դϴ�.");
		}
		
	}

}
