package CHAPTER10.EX02_Polymorphism;


//��� ���� �����
class A {}
class B extends A{}
class C extends B{}
class D extends B{}

public class Polymorphism {

	public static void main(String[] args) {
		// A Ÿ���� ������ ǥ��
		A a1 = new A(); //A�� A�̴�.
		A a2 = new B(); //B�� A�̴�.
		A a3 = new C(); //C�� A�̴�.
		A a4 = new D(); //D�� A�̴�.
		
		//B Ÿ���� ������ ǥ��
//		B b1 = new A(); 
		B b2 = new B(); 
		B b3 = new C();
		B b4 = new D();
		
		//C Ÿ���� ������ ǥ��
//		C c1 = new A();
//		C c2 = new B();
		C c3 = new C();
//		C c4 = new D();
		
		//D Ÿ���� ������ ǥ��
//		D d1 = new A();
//		D d2 = new B();
//		D d3 = new C();
		D d4 = new D();
	}

}
