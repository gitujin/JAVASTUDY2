package CHAPTER16.EX02_AvailableMethodInGenericMethod;

class A{
	public <T> void method (T t) {
		//System.out.println(t.length());
		System.out.println(t.equals("�ȳ�"));
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("�ȳ�");
	}
}
