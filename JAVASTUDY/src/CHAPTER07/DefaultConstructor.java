package CHAPTER07;

class Ac {
	int m;
	void work() {
		System.out.println(m);
	}
	/* 
	 A() {
	 
	 }
	 */
}
class B {
	int m;
	void work() {
		System.out.println(m);
	}
	B(){
		
	}
}
class C {
	int m;
	void work() {
		System.out.println(m);
	}
	C(int a){
		m = a;
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ac a = new Ac();
		B b = new B();
		//C c = new C();
		C c = new C(3);
		
		//메서드 호출
		a.work();
		b.work();
		c.work();
	}

}
