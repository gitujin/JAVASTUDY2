package CHAPTER11.EX02_FinalModifier_2;

class A{
	void abc() {}
	final void bcd() {}
}
class B{
	void abc() {}
	// void bcd(){} -> final 메서드는 오버라이딩 불가능
}
final class C{}
//class D extends C{} -> final 클래스는 상속 자체가 불가능

public class FinalModifier_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
