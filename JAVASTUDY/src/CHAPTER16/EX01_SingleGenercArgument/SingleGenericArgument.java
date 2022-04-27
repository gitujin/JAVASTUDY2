package CHAPTER16.EX01_SingleGenercArgument;

class MyClass<T>{ //���׸� Ŭ���� ����
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class SingleGenericArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass<String> mc1 = new MyClass<String>(); // ���׸� Ÿ������ String ���� 
		mc1.set("�ȳ�"); // T�� ���׸� ������ String���� ġȯ
		System.out.println(mc1.get());
		
		MyClass<Integer> mc2 = new MyClass<>(); // IntegerŸ���� ����
		mc2.set(100); // T�� ���׸� ������ Integer���� ġȯ
		System.out.println(mc2.get());
		
//		MyClass<Integer> mc3 = new MyClass<Integer>(); //IntegerŸ���� ���׸� Ÿ������ ����������
//		mc3.set("�ȳ�"); //String�� �����Ͽ� ���� Ÿ�� üũ�� ���� ���� �߻� 
	}

}
