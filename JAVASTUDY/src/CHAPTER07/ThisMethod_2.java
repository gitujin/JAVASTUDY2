package CHAPTER07;

class A2 {
	int m1, m2, m3, m4;
	A2(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	A2(int a){
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	A2(int a, int b){
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}

class B1{
	int m1, m2, m3, m4;
	B1(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	B1(int a){
		this();
		m1 = a;
	}
	B1(int a, int b){
		this(a);
		m2 = b;
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}

public class ThisMethod_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a1 = new A2();
		A2 a2 = new A2(10);
		A2 a3 = new A2(10,20);
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
		
		B1 b1 = new B1();
		B1 b2 = new B1(10);
		B1 b3 = new B1(10,20);
		b1.print();
		b2.print();
		b3.print();
		System.out.println();
	}

}
