package CHAPTER16.EX02_InheritanceGenericMethod;

class Parent {
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
}
class Child extends Parent{
	
}

public class InheritanceGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �θ� Ŭ�������� ���׸� �޼��� �̿�
		Parent p = new Parent();
		p.<Integer>print(10);
		p.print(10);
		
		// �ڽ� Ŭ�������� ���׸� �޼��� �̿�
		Child c = new Child();
		c.<Double>print(5.8);
		c.print(5.8);
	}

}
