package CHAPTER16.EX02_AvailableMethodInGenericMethod;

class A{
	public <T> void method (T t) {
		//System.out.println(t.length());
		System.out.println(t.equals("¾È³ç"));
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("¾È³ç");
	}
}
