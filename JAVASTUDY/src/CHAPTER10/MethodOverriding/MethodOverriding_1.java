package CHAPTER10.MethodOverriding;

class A1{
	void print() {
		System.out.println("A 클래스");
	}
}

class B11 extends A1{
	@Override
	void print() {
		System.out.println("B 클래스");
	}
}

public class MethodOverriding_1 {

	public static void main(String[] args) {
		// A 타입/ A 생성자
		A1 aa = new A1();
		aa.print();
		
		//B 타입 / B 생성자
		B11 bb = new B11();
		bb.print();
		
		//A 타입 / B 생성자
		A1 ab = new B11();
		ab.print();
	}

}
