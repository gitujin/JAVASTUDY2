package CHAPTER09;

public class B {
	public void print() {
		//객체 생성
		A a = new A();
		
		//멤버 활용
		System.out.print(a.a + " ");
		System.out.print(a.b + " ");
		System.out.print(a.c + " ");
		//System.out.println(a.d + " "); //private 접근 지정자로 접근 불가능
		System.out.println();
	}
}
