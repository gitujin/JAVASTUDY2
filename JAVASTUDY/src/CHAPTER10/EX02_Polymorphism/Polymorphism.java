package CHAPTER10.EX02_Polymorphism;


//상속 관계 만들기
class A {}
class B extends A{}
class C extends B{}
class D extends B{}

public class Polymorphism {

	public static void main(String[] args) {
		// A 타입의 다형적 표현
		A a1 = new A(); //A는 A이다.
		A a2 = new B(); //B는 A이다.
		A a3 = new C(); //C는 A이다.
		A a4 = new D(); //D는 A이다.
		
		//B 타입의 다형적 표현
//		B b1 = new A(); 
		B b2 = new B(); 
		B b3 = new C();
		B b4 = new D();
		
		//C 타입의 다형적 표현
//		C c1 = new A();
//		C c2 = new B();
		C c3 = new C();
//		C c4 = new D();
		
		//D 타입의 다형적 표현
//		D d1 = new A();
//		D d2 = new B();
//		D d3 = new C();
		D d4 = new D();
	}

}
