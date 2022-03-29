package CHAPTER11.EX02_AbstractModifier;

abstract class Animal {
	abstract void cry();
}
class Cat extends Animal{
	void cry() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("�۸�");
	}
}
public class AbstractModifier_2 {

	public static void main(String[] args) {
		// ��ü ����
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		// �޼��� ȣ��
		animal1.cry();
		animal2.cry();

	}

}
